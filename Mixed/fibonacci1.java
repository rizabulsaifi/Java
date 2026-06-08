
import java.util.*;

public class fibonacci1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            int first = 0;
            int second = 1;
            for (int i = 0; i < n; i++) {

                int next = first + second;
                first = second;
                second = next;
                System.out.print(first+", ");
            }
        }
    }
}
