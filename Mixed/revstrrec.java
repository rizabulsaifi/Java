
import java.util.Scanner;

public class revstrrec {
    public static void reverse(String str, int idx){
       if(idx==0){
        System.out.print(str.charAt(idx));
        return;
       }
       System.out.print(str.charAt(idx));
       reverse(str, idx-1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String Word : ");
            String str = sc.nextLine();
            reverse(str, str.length()-1);
        }
    }
}