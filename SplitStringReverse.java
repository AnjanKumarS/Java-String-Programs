public class SplitStringReverse {
    public static void main(String[] args) {
        String s = "java is very easy";
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            String rev = s1[i];

            for (int j = rev.length() - 1; j >= 0; j--) {
                System.out.print(rev.charAt(j));
            }
            System.out.println();
        }
    }
}
