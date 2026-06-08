// print number n to 1 using recursion

import java.util.Scanner;

public class print5to1 {
    public static void printNumber(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            printNumber(n);
        }
    }
}
