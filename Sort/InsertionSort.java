import java.util.Scanner;
public class InsertionSort {
    
    static void sort(int[] arr){
        int n = arr.length;
    
        for(int i = 1; i<n; i++){
            int j = i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter Size of Element : ");
            int size = sc.nextInt();
            System.out.print("Enter Element of Array : ");
            int[] arr = new int[size];
            for(int i = 0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println();
            sort(arr);
            display(arr);
        }
    }
}   