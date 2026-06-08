// Quantum Class single inheritance

class A{
    void show(){
        System.out.println("Hello");
    }
}
class B extends A{
    void get(){
        System.out.println("java");
    }
}
public class single_inheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.get();
    }
}
// && || <= >= == > < 