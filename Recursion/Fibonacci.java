
import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        if(n==0||n==1) return n;

        int first = fibo(n-1);
        int second = fibo(n-2);

        return first + second;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number for print Fibonacci Series : ");
            int n = sc.nextInt();

            System.out.println(fibo(n));
        }
    }
}
