import java.util.*;

public class foundnumber2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // rows input
            System.out.print("Enter Number of Rows : ");
            int rows = sc.nextInt();
            // column input
            System.out.print("Enter Number of Column : ");
            int column = sc.nextInt();

            int numbers[][] = new int[rows][column];
            //  input for 2D Array
            for(int i =0; i<rows; i++) {
                for(int j = 0; j < column; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter x value : " );
            int x = sc.nextInt();

            // output for 2D Array
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < column; j++) {
                    if(numbers[i][j] == x) {
                        System.out.println("x found at location ("+i+","+j+")");
                    }
                }
                System.out.println();
            }
        }
    }
}