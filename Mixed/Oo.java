public class Oo {
    public static void main(String[] args) {
        int n = 5;
        // int m = 5;
        for(int j = 1; j <= n; j++) {
            for(int k = 1; k<=n-2; k++) {
                if(k==1 || j == 1 || j==n || k==n) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}

