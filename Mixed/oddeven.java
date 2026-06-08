import java.util.*;

public class oddeven 
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("The Given Number is Even");
            }
            else{
                System.out.println("The Given Number Is Odd");
            }
        }
    }
}
    