// Widening Casting
// Widening casting is done automatically when passing a smaller size type to a larger size type:


public class WideningTypeCasting{
    public static void main(String[] args) {
        int IntVar = 9;
        double DoubleVar = IntVar;

        System.out.println(IntVar);
        System.out.println(DoubleVar);
    }

}