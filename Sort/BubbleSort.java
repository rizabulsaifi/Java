public class BubbleSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            boolean flag = false;
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }
    static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {7,3,4,6,9,8,4,5,2,1,0};
        sort(arr);
        display(arr);
    }
}