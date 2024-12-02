public class ToUpperCase {

    public static void main(String[] args) {
        String s = "Hellow Java";
        String res = " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                res = res + (char) (s.charAt(i) - 32);
            } else {
                res = res + s.charAt(i);
            }
        }
        System.out.println(res);
    }
}