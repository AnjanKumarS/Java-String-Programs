public class StringPalindrome {
    public static void main(String[] args) {
        String s = "Abcba";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if(s.equalsIgnoreCase(rev))
            System.out.println(s+" : Palindrome");
        else
            System.out.println(s+" : Not a Palindrome");
    }
}
