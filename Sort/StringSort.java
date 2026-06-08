public class StringSort {
    static void sort(String[] str){
        int n = str.length;

        for(int i = 0; i<n-1; i++){
            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(str[j].compareTo(str[min_index])<0){
                    min_index = j;
                }
            }
            String temp = str[min_index];
            str[min_index] = str[i];
            str[i] = temp;
        }
    }
    static void printArray(String[] str){
        for(String val : str){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] Riz){
        String[] str = {"Rizabul", "Saifi", "Mohd", "Apple","Watermelon" };

        sort(str);
        printArray(str);
    }
}
