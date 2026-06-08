public class overloading {
    public void display(int a){
        System.out.println("Disply method with integer : "+a);
    }
    public void display(int a, int b){
        System.out.println("Disply method with  two integer : " + a + " and " + b);
    }
    public void display(String s){
        System.out.println("Disply method with String : "+s);
    }
    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.display(10);
        obj.display(10,20);
        obj.display("Hello");
    }
}