import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number in this table :\n 1 \n 2 \n 3 \n 4 \n 5\n 6\n 7 ");
        System.out.print("Enter a Number : ");
        int day = sc.nextInt();
        
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter Correct Number : ");
        }
    }
}
