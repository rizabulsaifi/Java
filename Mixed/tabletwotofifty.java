public class tabletwotofifty {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
