public class FirstWorldCapital {
    public static void main(String[] args) {
        String s = "java is a very easy programming language";
        String[] s1 = s.split(" ");

        for (int i = 0; i < s.length(); i++) {
            String val = s1[i];
            String res = " ";
            for (int j = 0; j < val.length(); j++) {
                if (val.charAt(j) >= 'a' && val.charAt(j) <= 'z' && j==0) {
                    res = res + (char) (val.charAt(j) - 32);
                } else {
                    res = res + val.charAt(j);
                }
            }
            System.out.println(res);
        }
    }
}
