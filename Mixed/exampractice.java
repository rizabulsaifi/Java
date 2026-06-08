public class exampractice{

    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i< s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int i : count){
            if(i!= 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        System.out.println(areAnagrams(s1, s2));
    }
}