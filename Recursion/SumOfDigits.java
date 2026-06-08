
import java.util.Scanner;

public class SumOfDigits {

    static int sod(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return sod(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            System.out.println("Sum of all Digits : "+sod(n));
        }
    }
}