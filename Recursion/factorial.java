import java.util.Scanner;

public class factorial{
    static int fact(int n){
        if(n == 0) return 1;

        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nulber for check factorial : ");
        int n = sc .nextInt();
        System.out.println(n+" Factorial is : "+fact(n));
    }
}
