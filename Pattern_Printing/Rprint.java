public class Rprint {

    public static void main(String[] args) {
        int n = 6;
        for(int i =1; i<= n; i++) {
            for(int j = 1; j<=n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= n-3; i++) {
            System.out.print("*");
            for(int j = 1; j<=i+1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=1; j++) {
                System.out.println("  *");
            }
            System.out.println();
        }
    }
}
