import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            // int a = 0;
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    // a = 1;
                    flag = false;
                    break;
                }
            }
            if(n==1) System.out.println("The given number Neither prime nor composite number");
            else if(flag==true) System.out.println("The  given number is prime number ");
            else  System.out.println("the given number is composite ");
        }
    }
}