import java.util.*;
public class reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            int r=0;
            while (n>0) {
                int lastDigit = n%10;
                r=r+lastDigit;
                r=r*10;
                n = n/10;
            }
            r =r/10;
            System.out.println("The given number reverse are : "+r);
        }
    }
}
