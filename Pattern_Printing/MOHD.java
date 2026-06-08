


public class MOHD {
    public static void main(String[] args) {

        int n = 6;
        for(int i = 1; i <= n; i++) {
            System.out.print("M");

            for(int j = 1; j <= n; j++) {
                if(i == j && j <= n/2 || i+j == n && j >= n/2) {
                    System.out.print("M");
                }

            else {
                System.out.print(" ");
            }
        }
            System.out.print("M");

            for(int j = 1; j <= 1; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=n; j++) {
                if(j==1 || i == 1 || i==n || j==n) {
                    System.out.print(" O");
                }
                
                else {
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= n-5; j++) {
                System.out.print(" H");
                for(int k = 1; k <= n-3; k++) {
                    if(i == n/2) {
                        System.out.print(" H ");
                    }

                    else {
                        System.out.print("   ");
                    }
                }

                System.out.print("H");
            }
                for(int j = 1; j<=n-2; j++) {
                    if(j==1 || i == 1 || i==n || j==n) {
                        System.out.print(" D ");
                    }

                    else {
                        System.out.print("    ");
                    }
                }

                System.out.print("D");
                System.out.println();
            }

        System.out.println();

    }
}