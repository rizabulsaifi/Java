//Aim -> print number n to  100 using recursion
import java.util.Scanner;


public class print1to5 {
    public static void printNumber(int n) {
        if(n==101){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args) {
        try (// int n = 1;
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            printNumber(n);
        }
    }
}
