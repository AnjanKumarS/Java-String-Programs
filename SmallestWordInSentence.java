public class SmallestWordInSentence {
    public static void main(String[] args) {
        String s = "java is a very easy programming language";
        String[] s1 = s.split(" ");
        String smw = s1[0];

        for (int i = 0; i < s1.length; i++) {
            if (smw.length() > s1[i].length()) {
                smw = s1[i];
            }
        }
        System.out.println("Smallest word : "+smw);
    }
}
