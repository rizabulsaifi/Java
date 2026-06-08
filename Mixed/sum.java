import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter Value of b : ");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.print("a + b = ");
            System.out.println(sum);
        }
    }
}
