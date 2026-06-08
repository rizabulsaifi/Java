

public class Y {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if( i == j && j <= n/2 || i+j == n+1 && j >= (n-3)/2 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}