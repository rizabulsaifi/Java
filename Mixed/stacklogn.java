import java.util.Scanner;
public class stacklogn {
    public static int Stackn(int n, int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return Stackn(n/2, x) * Stackn(n/2, x);
        }
        else{
            return Stackn(n/2, x) * Stackn(n/2, x) * x;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Value of x : ");
            int x = sc.nextInt();
            System.out.print("Enter Power of x : ");
            int n = sc.nextInt();
            int ans = Stackn(n, x);
            System.out.println(ans);
        }
    }
}
