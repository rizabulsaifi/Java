import java.util.*;

public class button {
    public static void main()
    {
        System.out.print("Enter a button (1,2,3) : ");
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

            // if(num == 1) {
            //     System.out.println("Hii");
            // }
            // else if(num == 2) {
            //     System.out.println(" Assalamualaikum ");
            // }
            // else if(num == 3) {
            //     System.out.println("Bonjour");
            // }
            // else {
            //     System.out.println("Invalid Number! Please Choose Correct Number ");
            // }
            switch(button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Assalamualaikum");
                case 3 -> System.out.println("Bonjour");
                default -> System.out.println("Invalid button! Please choose Correct button");
            }
        }
    }
}