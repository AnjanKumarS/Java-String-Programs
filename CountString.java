public class CountString {
    public static void main(String[] args) {
        String s = "mahabharat";
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(ch+""+count);
            }
        }
    }
}
