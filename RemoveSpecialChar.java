public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "$ja!va$&st%ar";
        String n = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                n += s.charAt(i);
            }
        }
        System.out.println(n);
    }
}
