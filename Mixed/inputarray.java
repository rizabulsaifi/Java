
import java.util.*;

public class inputarray {
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

            // output
            for(int i = 0; i < size; i++) {
                System.out.print("Index ["+i+"] = ");
                System.out.println(numbers[i]);
            }
        }
    }
}