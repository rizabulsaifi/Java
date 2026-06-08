// Find the Largest and Smallest Element in an Array.
public class SmallestElement {
    public static void main(String[] args) {

        
        int[] arr = {10, 20, 30, 40, 50};
        int smallest = arr[0];
        int largest = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            if(arr[i] > largest) {
                largest = arr[i];
            }
    
            }
            System.out.println("Smallest Element: " + smallest);
            System.out.println("Largest Element: " + largest);
    }    
}