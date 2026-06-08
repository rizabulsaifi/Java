public class EvenOddSumArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumOfEven += arr[i][j];
                } else {
                    sumOfOdd += arr[i][j];
                }
            }
        }

        System.out.println("Sum of Even numbers: " + sumOfEven);
        System.out.println("Sum of Odd numbers: " + sumOfOdd);
    }
}
