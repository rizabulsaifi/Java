
// Narrowing Casting
// Narrowing casting must be done manually by placing the type in parentheses () in front of the value:

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        int a = 8;
        double b = 9.6;

        int c = (int) b;
        double d = (double) a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
