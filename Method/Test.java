
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[5];
        for(int i = 0; i<arr.length; i++){            
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // char[] arr = {'R', 'i', 'z', 'a', 'b', 'u', 'l'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print((int)arr[i]+" ");
        }
    }
}
