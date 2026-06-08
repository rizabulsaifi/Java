public class MultiplicationTables {
    public static void main(String[] args) {
        for(int i = 2; i <= 50; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println("Table of "+i+" :  "+i+" * "+j+" = "+(i*j));
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}