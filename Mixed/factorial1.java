import java.util.*;
public class factorial1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            int product = 1;
            for(int i = 1; i <=n; i++) {
                product = product*i;
            }
            System.out.println("The given number "+n+" Factorial is : "+product);
        }
    }
}