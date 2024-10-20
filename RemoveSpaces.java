public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "  J a va  S t a r   ";

        String str1 = s.trim();//trim() removes starting and ending values
        System.out.println(str1);

        String str2 = str1.replaceAll("\\s", "");
        System.out.println(str2);
    }
}
