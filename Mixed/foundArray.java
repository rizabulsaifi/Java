
import java.util.Scanner;


public class foundArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array : ");
            int size = sc.nextInt();
            int numbers[] = new int[size];


            // input
            for(int i = 0; i < size; i++) {
                System.out.print("Enter Number of " + i + " in Array : ");
                numbers[i] = sc.nextInt();
            }
            System.out.print("Enter the number find in Array :");
            int x = sc.nextInt();

            // output
            for(int i = 0; i < size; i++) {
                if(numbers[i] == x) {
                    System.out.print("x found in Array at number "+ i);
                }
            }
        }
    }
}