public class CountWords {
    public static void main(String[] args) {
        String s = "java is very easy programming language";
        String[] s1 = s.split(" ");
        int count = 0;

        for (int i = 0; i < s1.length; i++) {
            count++;
        }

        System.out.println(count);
    }
}
