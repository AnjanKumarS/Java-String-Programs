public class FrequencyOfEachWords {
    public static void main(String[] args) {
        String s = "java is a very easy programming language";
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            int c = 0;
            for (int j = 0; j < s2.length(); j++) {
                c++;
            }
            System.out.println(s2+"="+c);
        }
    }
}
