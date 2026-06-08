
import java.util.*;



public class reversewordsinstring {
    public static void main(String[] args) {
        try (// String str = "I am an online educator";
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String as a sentences : ");
            String str = sc.nextLine();
            String ans = "";
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch !=' '){
                    sb.append(ch);
                }
                else{
                    sb.reverse();
                    ans +=sb;
                    ans +=" ";
                    sb = new StringBuilder();
                }
            }
            sb.reverse();
            ans += sb;
            System.out.println(ans);
        }
    }
}
