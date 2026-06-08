
import java.util.*;

public class calcPower {
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powernm1 = Power(x, n-1);
        int powern = x*powernm1;
        return powern;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number : ");
            int x = sc.nextInt();
            System.out.print("Enter Number of Power : ");
            int n = sc.nextInt();
            int ans = Power(x, n);
            System.out.println(ans);
        }
    }
}