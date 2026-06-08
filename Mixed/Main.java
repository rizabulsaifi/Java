import java.util.Scanner;
class Algebra{
    int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
public class Main{
    public static void main(String args[]){
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        System.out.print("Sum of two Number is : ");
        System.out.println(obj.add(a, b));
    }
}