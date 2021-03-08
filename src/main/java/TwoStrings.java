public class TwoStrings {
    private final String YES = "YES";
    private final String NO = "NO";

    public String twoStrings(String s1, String s2) {

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++)
                if (s1.charAt(i) == s2.charAt(j)) {
                    return YES;
                }
        }
        return NO;
    }

    public static void main(String[] args) {
        TwoStrings two = new TwoStrings();
        System.out.println(two.twoStrings("Pakistan", "XYZ"));
    }
}
