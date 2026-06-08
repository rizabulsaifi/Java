class A{
    void show(){
        System.out.println("Hello");
    }
}
class B {
    void gets(){
        System.out.println("Java");
    }
}
class C extends A {
    void display(){
        System.out.println("Programming");
    }
    void gets(){
        System.out.println("Java");
    }
}
public class multiple_inhertance{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.gets();
        obj.display();
    }
}