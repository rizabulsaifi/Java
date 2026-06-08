public class first_last_char {
    public static int first = -1;
    public static int last = -1;

    public static void Occurrence(int idx, String str, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first = idx;
            } else{
                last = idx;
            }
            Occurrence(idx+1, str, element);
        }
    }
    public static void main(String[] args) {
        String str = "Rizabulsaifi";
        Occurrence(0, str, 'i');
    }
}