
import java.util.Scanner;

public class function1 {
    public static void bioData(int age, int roll_no, String name, float marks) {
        System.out.println("Your Age is " + age);
        System.out.println("Your Roll Number is " + roll_no);
        System.out.println("Your Name is " + name);
        System.out.println("Your Marks are " + marks);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Your Roll Number: ");
            int roll_no = sc.nextInt();

            sc.nextLine(); // Consuming the leftover newline

            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Your Marks: ");
            float marks = sc.nextFloat();

            bioData(age, roll_no, name, marks);
        }
    }
}
