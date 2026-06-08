
import java.util.Scanner;

// sum of n number using recursion
public class sumofnNumbers {
    public static void printNumber(int i, int n, int sum){
        if(n==i){
            sum += i;
            System.out.println("Sum of all Sum Numbers : "+sum);
            return;
        }
        sum += i;
        printNumber(i+1, n, sum);
        // System.out.println(i);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter Value of i :");
            // int i = sc.nextInt();
            System.out.print("Enter Value of n : ");
            int n = sc.nextInt();
            // System.out.print("Enter Value of sum :");
            // int sum = sc.nextInt();
            printNumber(1, n, 0);
        }
    }
}