import java.util.*;

public class adult {
    public static void main(String[] args) {
        System.out.print("Enter your Age : ");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if(age>=18)
            {
                System.out.println("You are an Adult : ");
            }
            else{
                System.out.println("You are a Minor : ");
            }
        }
    }
}