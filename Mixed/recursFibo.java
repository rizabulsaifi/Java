
import java.util.Scanner;

public class recursFibo {

    public static void Fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        Fibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.println(a+"\n"+b);
            Fibonacci(a, b, n-2);
        }
    }
}
