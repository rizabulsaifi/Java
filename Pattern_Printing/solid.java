
import java.util.Scanner;

public class solid {
    public static void solid_rectangle(int n, int m){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Rows : ");
            int row = sc.nextInt();
            System.out.print("Enter Columns : ");
            int column = sc.nextInt();
            solid_rectangle(row,column);
        }
    }
}
