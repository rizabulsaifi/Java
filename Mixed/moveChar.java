
public class moveChar {
    public static void movecharcter(String str, String newString, int idx, char ch, int count){
        if(idx==str.length()){
            for(int i = 0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            movecharcter(str, newString, idx+1, ch, count);
        } else{
            newString += currChar;
            movecharcter(str, newString, idx+1, ch, count);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        movecharcter(str, "", 0, 'x', 0);
    }
}
