
import java.util.Scanner;

public class onetoten{
    public static void PrintIncreas(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintIncreas(n-1);
        System.out.println(n);
        
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        PrintIncreas(n);
    }
}

