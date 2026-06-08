
import java.util.Scanner;

public class productfunction {
    public static int calculateProduct(int a, int b) {
        return a*b;
    }
    public static void main(String[] saifi) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value a : ");
            int a = sc.nextInt();
            System.out.print("Enter Value of : ");
            int b = sc.nextInt();
            System.out.print("Product 2 Number : "+calculateProduct(a, b));
        }
    }
}
