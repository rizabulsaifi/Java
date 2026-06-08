import java.util.*;

public class table {
    public static void main(String[] arrgs){
        System.out.print("Enter a number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            //int sum;
            for(int i = 1; i<=10; i++) {
                System.out.println(n*i);
            }
        }
        
    }    
}
