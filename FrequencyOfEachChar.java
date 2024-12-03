public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String s = "anjan kumar is a good boy";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '@' && ch[i]!=' ') {
                int c = 1;
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ch[j] = '@';
                        c++;
                    }
                }
                System.out.println(ch[i]+"="+c);
            }
        }
    }
}
