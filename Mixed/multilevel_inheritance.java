// Quantum Class single inheritance
class A{
    void show(){
        System.out.println("hello");
    }
}
class B extends A{
    void get(){
        System.out.println("java");
    }

}
class C extends B{
    void display(){ // corrected spelling from 'dispaly' to 'display'
        System.out.println("Programming");
    }
}

public class multilevel_inheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.get();
        C obj1 = new C();
        obj1.show(); // added to demonstrate multilevel inheritance
        obj1.get();
        obj1.display();
    }
}