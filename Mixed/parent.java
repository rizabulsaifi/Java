// ovwerriding
public class parent {
    public void display(int a){
        System.out.println("Display from parent with integer : "+a);
    }
    public void display(int a, int b){
        System.out.println("Display from parent with two integer : "+a);
    }
    public void display(String  s){
        System.out.println("Display from parent with String : "+s);
    }
    public class overriding extends parent {
        @Override
        public void display(int a){
            System.out.println("Display from child with integer : "+ a);
        }
        @Override
        public void display(int a, int b){
            System.out.println("Display from child with two integer : "+ a+" and "+b);
        }
        @Override
        public void display(String s){
            System.out.println("Display from child with String : "+ s);
        }
    }
    public static void main(String[] args) {
        parent obj = new parent();
        obj.display(10);
        obj.display(10,20);
        obj.display("Hello");
    }
}