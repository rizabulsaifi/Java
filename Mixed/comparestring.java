import java.util.Scanner;
public class comparestring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name1 : ");
            String name1 = sc.nextLine();

            System.out.print("Enter name2 : ");
            String name2 = sc.nextLine();

            if(name1.compareTo(name2)==0) {
                System.out.print("Both name is equal : ");
            }
            else{
                System.out.print("both name are not equal : ");
            }
        }
    }
}
