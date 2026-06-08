import java.util.Scanner;

public class calculator {
    static  int add(int a, int b) {
        return a + b;
    }

    static int multiple(int a, int b) {
        return a * b;
    }

    static int subtract(int b, int a) {
        return a - b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero !!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Value : ");
            int a = sc.nextInt();

            System.out.print("Enter Second Value : ");
            int b = sc.nextInt();

            System.out.println("Addition : "+add(a, b));
            System.out.println("Subtraction : "+subtract(b, a));
            System.out.println("Multiple : "+multiple(a, b));
            System.out.println("Division : "+divide(a, b));
        }
    }
}
