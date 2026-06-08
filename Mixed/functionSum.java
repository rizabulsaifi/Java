import java.util.*;
public class functionSum {
    public static int calculatesum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] saifi) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a value : ");
            int a = sc.nextInt();
            System.out.print("Enter b value : ");
            int b = sc.nextInt();
            int sum = calculatesum(a, b);
    System.out.println("Sum of 2 Number is : "+sum);
        }
    }
}
