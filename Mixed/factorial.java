import java.util.*;
    public class factorial{
    public static void factorialprint(int n) {
        if(n < 0) {
            System.out.println("invalid Number : ");
            return;
        }
        int factorial = 1;
        for(int i = n; i >= 1; i--) {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Value of n : ");
            int n = sc.nextInt();
            factorialprint(n);
        }
    }
}
