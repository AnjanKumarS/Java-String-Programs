public class SplitStringReverseEven {
    public static void main(String[] args) {
        String s = "Java is very easy programming language";
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            String rev = s1[i];

            if (i % 2 != 0) {
                for (int j = rev.length() - 1; j >= 0; j--) {
                    System.out.print(rev.charAt(j));
                }
            }
            else {
                System.out.print(s1[i]);
            }
            System.out.println();
        }
    }
}
