public class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over a lazy dog".toLowerCase();
        String ref = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = true;

        for (int i = 0; i < ref.length(); i++) {
            if (s.indexOf(ref.charAt(i)) == -1) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
