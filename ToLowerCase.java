public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hellow JAVA";
        String res = " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                res = res + (char) (s.charAt(i) + 32);
            } else {
                res = res + s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
