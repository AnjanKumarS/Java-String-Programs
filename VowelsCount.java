public class VowelsCount {
    public static void main(String[] args) {
        String s = "education";
        String o = "aeiou";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < o.length(); j++) {
                if (s.charAt(i) == o.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println("Total number of vowels: " + count);
    }
}
