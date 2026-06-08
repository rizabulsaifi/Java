public class Hh {

    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n-1; i++) {
            System.out.print("*");
            for(int j = 1; j <= n-3; j++) {
                if(i == n/2) {
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