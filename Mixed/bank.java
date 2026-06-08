
import java.util.Scanner;
public class bank {
    public static int add(int currentBalance, int amount){
            return currentBalance+amount;
    }
    public static int withdraw(int currentBalance, int amount){
        if(currentBalance<amount){
            System.out.println("_________________________");
            System.out.println("Insufficient balance!");
            System.out.println("_________________________");
            return currentBalance;
        }
            return currentBalance-amount;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int currentBalance = 100 ;
            int choice ;
            do{
                System.out.println("______________________Menu______________________________________");
                System.out.println("Check your current balance : 0 ");
                System.out.println("For Add Enter : 1 ");
                System.out.println("For Withdraw Enter : 2");
                System.out.println("Exit : 3");
                System.out.println("________________________________________________________________");
                System.out.print("Enter your Choice :  ");
                choice = sc.nextInt();
                switch (choice) {
                    case 0 -> {
                        System.out.println();
                        System.out.println("Now is Current Balance : "+currentBalance);
                        System.out.println();
                    }
                    case 1 -> {
                        System.out.print("Enter adding amount : ");
                        int amount = sc.nextInt();
                        currentBalance = add(currentBalance , amount);
                        System.out.println();
                        System.out.println("Now is Current Balance : "+currentBalance);
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.print("Enter withdraw amount : ");
                        int amount = sc.nextInt();
                        currentBalance = withdraw(currentBalance , amount);
                        System.out.println();
                        System.out.println("Now is Current Balance : "+currentBalance);
                        System.out.println();
                    }
                }
            }while(choice != 3);
        }
    }
}