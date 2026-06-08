import java.util.*;

public class equal {
    public static void main(String[] args)
    {
        System.out.print("Enter value of x : ");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            System.out.print("Enter Value of y : ");
            int y = sc.nextInt();

            if(x == y)
            {
                System.out.println("The given Is Equal");
            }
            else if(x > y)
            {
                System.out.println("The given in x Greater Then y ");
            }
            else{
                System.out.println("The Given Number in x Less Then y ");
            }
        }
    }
}