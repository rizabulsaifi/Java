import java.util.*;

public class TwoDArray {
    public static void main(String[] aargs) {
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
            // output for 2D Array 
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < column; j++) {
                    System.out.print(numbers[i][j]+ "  ");
                }
                System.out.println();
            }
        }
    }
}
