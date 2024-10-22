import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "welcometojava";
        String[] str = s.split("");
        Arrays.sort(str);
        for (String ss : str) {
            System.out.println(ss);
        }
    }
}
