import java.util.*;
public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try (// int arr[] = {8, 7, 3, 1, 2};
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array : ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter "+ size+" Element in Array : ");
            for(int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 1; i < arr.length; i++){
                int current = arr[i];
                int j = i-1;
                while(j >= 0 && current < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
            printArray(arr);
        }
    }
}
