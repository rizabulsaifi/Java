
import java.util.*;
public class TowerOfHanoi {
    public static void Tower(int n, String src, String help, String des){
        if(n==1){
            System.out.println( " Transfer Disk "+n+" from "+src+" to "+des);

            return;
        }
        Tower(n-1, src, des, help);
        System.out.println(" Transfer Disk "+n+" from "+src+" to "+des);
        Tower(n-1, help, src, des);
        // return 
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number of Disk : ");
            int n = sc.nextInt();
            Tower(n, "Tower 1", "Tower 2","Tower 3");
        }
    }
}
