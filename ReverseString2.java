public class ReverseString2 {
    public static void main(String[] args) {
        String s = "javaprogramming";
        String rev = " ";

        for (int i = 0; i < s.length(); i++) {
            //rev = s.charAt(i) + rev;
            rev = rev + s.charAt(s.length() - 1 - i);
        }
        System.out.println(rev);
    }
}
