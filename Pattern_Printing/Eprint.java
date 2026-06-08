
public class Eprint {
    public static void main(String[] name) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            System.out.print("*");
            for(int j = 1; j <= n-2; j++) {
                if(i%2==0) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();

        }
    }
}
