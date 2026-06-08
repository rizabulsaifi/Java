import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class bankdatabaseproject {
    static final String DB_URL = "cbdc:mysql://localhost:3306/bank_db"; // Replace with your database URL
    static final String USER = "root"; // Your MySQL username
    static final String PASS = ""; // Your MySQL password

    // Function to create an account
    public static void createAccount(Connection conn, String name, String contact, String accountType, double initialDeposit) throws SQLException {
        String sql = "INSERT INTO accounts (name, contact, account_type, balance) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, contact);
        stmt.setString(3, accountType);
        stmt.setDouble(4, initialDeposit);
        stmt.executeUpdate();
        System.out.println("Account created successfully!");
    }

    // Function to deposit money
    public static void deposit(Connection conn, int accountNo, double amount) throws SQLException {
        String sql = "UPDATE accounts SET balance = balance + ? WHERE account_no = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDouble(1, amount);
        stmt.setInt(2, accountNo);
        int rows = stmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    // Function to withdraw money
    public static void withdraw(Connection conn, int accountNo, double amount) throws SQLException {
        String sql = "SELECT balance FROM accounts WHERE account_no = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, accountNo);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            double balance = rs.getDouble("balance");
            if (balance >= amount) {
                sql = "UPDATE accounts SET balance = balance - ? WHERE account_no = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setDouble(1, amount);
                stmt.setInt(2, accountNo);
                stmt.executeUpdate();
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    // Function to view account details
    public static void viewAccount(Connection conn, int accountNo) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE account_no = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, accountNo);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            System.out.println("Account Number: " + rs.getInt("account_no"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Contact: " + rs.getString("contact"));
            System.out.println("Account Type: " + rs.getString("account_type"));
            System.out.println("Balance: " + rs.getDouble("balance"));
        } else {
            System.out.println("Account not found!");
        }
    }

    // Function to delete an account
    public static void deleteAccount(Connection conn, int accountNo) throws SQLException {
        String sql = "DELETE FROM accounts WHERE account_no = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, accountNo);
        int rows = stmt.executeUpdate();

        if (rows > 0) {
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Connected to the database!");
            while (true) {
                System.out.println("\nBank Management System");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View Account");
                System.out.println("5. Delete Account");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter contact: ");
                        String contact = scanner.next();
                        System.out.print("Enter account type (Savings/Current): ");
                        String accountType = scanner.next();
                        System.out.print("Enter initial deposit: ");
                        double initialDeposit = scanner.nextDouble();
                        createAccount(conn, name, contact, accountType, initialDeposit);
                        break;
                    case 2:
                        System.out.print("Enter account number: ");
                        int accountNo = scanner.nextInt();
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(conn, accountNo, depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter account number: ");
                        accountNo = scanner.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(conn, accountNo, withdrawAmount);
                        break;
                    case 4:
                        System.out.print("Enter account number: ");
                        accountNo = scanner.nextInt();
                        viewAccount(conn, accountNo);
                        break;
                    case 5:
                        System.out.print("Enter account number: ");
                        accountNo = scanner.nextInt();
                        deleteAccount(conn, accountNo);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
