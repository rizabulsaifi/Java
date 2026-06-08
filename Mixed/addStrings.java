import java.util.*;

public class addStrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your first Name : ");
            String firstname = sc.nextLine();
            System.out.print("Enter Your last Name : ");
            String lastname = sc.nextLine();

            // String firstname = "Mohd";
            // String lastname = "Rizabul";
            String fullname = firstname +" "+ lastname;
            System.out.println(fullname +" "+ fullname.length());
            for(int i = 0; i < fullname.length(); i++) {
                System.out.println(fullname.charAt(i));
            }
        }
    }
}