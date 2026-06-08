public class Unkownprint {
    public static void main(String[] args) {
        int n = 7; // height of the pattern
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            // Print M
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2)) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print E
            for (int j = 0; j < n-3; j++) {
                if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
                    System.out.print("E");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2 || i == 0 && j > 0 && j < n - 1) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print K
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == n / 2 || i - j == n / 2) {
                    System.out.print("K");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // move to the next line
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
