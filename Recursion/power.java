public class power {
    // static int pow(int p, int q){
    //     if(q==0) return 1;
    //     return pow(p, q-1) * p;
    // }

    static int pow(int p, int q){
        if(q==0) return 1;

        if(q%2==0){
            return pow(p, q/2) * pow(p, q/2);
        }

        return p * pow(p, q/2) * pow(p, q/2);
    }
    public static void main(String[] args){
        System.out.println(pow(5, 4));
    }
}
