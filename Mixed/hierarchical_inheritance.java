// hierarchical inheritance Quantum Class

class A {

    void show() {
        System.out.println("Hello");
    }
}

class B extends A {

    void get() {
        System.out.println("Java");
    }
}

class C extends A {

    void display() {
        System.out.println("Programming");
    }
}

public class hierarchical_inheritance {

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.get();
        C obj2 = new C();
        obj2.show();
        obj2.display();
    }
}
