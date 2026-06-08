import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        System.out.print("Enter A Number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // print upper part of butterfly
            for(int i = 1; i <= n; i++) {
                // print star of half upper part
                for(int j = 1; j <= i; j++ ) {
                    System.out.print(" * ");
                }
                // print space of upper part
                int space = 2 * (n - i);
                for(int j = 1; j <= space; j++) {
                    System.out.print("   ");
                }
                // print star upper right half part
                for(int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            // print Down part of butterfly
            for(int i = n; i >= 1; i--) {
                // print star of half Down part
                for(int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                // print space of Down part
                int space = 2 * ( n-i); 
                for(int j = 1; j <= space; j++) {
                    System.out.print("   ");
                }
                // print star Down right half part
                for(int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }  
    }
}