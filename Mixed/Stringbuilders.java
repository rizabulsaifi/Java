public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Saife");
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        sb.setCharAt(4, 'i');
        System.out.println(sb);
        sb.insert(0, 'R');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
    }
}