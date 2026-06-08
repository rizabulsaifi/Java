public class Rizabul {
    public static void main(String[] args) {
        int n = 7; // height of the pattern

        for (int i = 0; i < n; i++) {
            // Print R
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n / 2 && j < n - 1) || (j == n - 1 && i != 0 && i < n / 2) || (i - j == n / 2)) {
                    System.out.print("R");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("I");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print Z
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("Z");
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

            // Print B
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 || i == n / 2 || i == n - 1) && j < n - 1 || j == n - 1 && i != 0 && i != n / 2 && i != n - 1) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print U
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i < n - 1 || i == n - 1 && j > 0 && j < n - 1) {
                    System.out.print("U");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // space between letters

            // Print L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("L");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // move to the next line
        }
    }
}
