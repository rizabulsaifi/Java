class Pen {
    String type;
    String color;
    
    void write() {
        System.out.println(this.type);
        System.out.println(this.color);
    }
    Pen(String type, String color){
        this.type = type;
        this.color = color;
    }
}
class Student {
    String name;
    int age;
    void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class oops1 {
    public static void main(String[] args) {
        Pen p1 = new Pen("Gel","Black");
        p1.write();
        System.out.println();
        System.out.println();

        Student s1 = new Student("Mohd Rizabul",19);
        s1.studentInfo();
    }
}