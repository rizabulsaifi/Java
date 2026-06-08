public class moveZero{
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] Riz){
        int[] arr = {5,5,2,0,9,4,0,8,7,0,2,8}; 

        sort(arr);
        printArray(arr);
    }
}