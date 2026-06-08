import java.util.ArrayList;
import java.util.Scanner;
public class SpirallyTraversalOnMatrix{
    static ArrayList<Integer> spiral(int[][] mat) {
        ArrayList<Integer> al = new ArrayList<>();
        int m = mat.length, n = mat[0].length;
        int FirstRow = 0, LastRow = m - 1;
        int FirstColumn = 0, LastColumn = n - 1;
        while (al.size() < m * n) {
            for (int i = FirstColumn; i <= LastColumn; i++) {
                al.add(mat[FirstRow][i]);
            }
            FirstRow++;

            if (al.size() == m * n) break;
            for (int i = FirstRow; i <= LastRow; i++) {
                al.add(mat[i][LastColumn]);
            }
            LastColumn--;

            if (al.size() == m * n) break;
            for (int i = LastColumn; i >= FirstColumn; i--) {
                al.add(mat[LastRow][i]);
            }
            LastRow--;

            if (al.size() == m * n) break;
            for (int i = LastRow; i >= FirstRow; i--) {
                al.add(mat[i][FirstColumn]);
            }
            FirstColumn++;
        }
        return al;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size of array : ");
            int size = sc.nextInt();
            int[][] arr = new int[size][size];
            System.out.print("Enter element in 2D array : ");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println(spiral(arr));
        }    
    }
}
