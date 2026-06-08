public class PrintKPattern {
    public static void main(String[] args) {
        int n = 5;  // You can change this value to adjust the size

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || (i <= n / 2 && j == n - i + 1) || (i > n / 2 && j == i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
