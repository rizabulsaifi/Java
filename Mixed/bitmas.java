public class bitmas {
    public static void main(String[] args) {
        int bit = 5;
        int pos = 1;
        int mask = 1<<pos;

        // if((bit & pos)==0) {
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was non-zero");
        // }
        int newNumber = mask | bit;
        System.out.println(newNumber);
    }
}