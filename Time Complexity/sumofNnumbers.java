import java.util.*;
public class sumofNnumbers{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            System.out.print(n*(n+1)/2);
        }
    }
}