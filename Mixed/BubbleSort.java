
import java.util.*;

public class BubbleSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (// int arr[] = {8, 7, 3, 1, 2};
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array : ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter " + size + " of Array : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            printArray(arr);
        }
    }
}
