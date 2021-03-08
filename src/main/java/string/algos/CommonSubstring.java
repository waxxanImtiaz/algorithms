package string.algos;

public class CommonSubstring {
    static String commonSubstring(String s1,String s2){
        for (int i = 0; i< s1.length(); i++){
            for (int j = 0; j< s2.length(); j++){
                if (s1.charAt(i) == s2.charAt(j))
                    return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(commonSubstring("and","art" ));
        System.out.println(commonSubstring("be","cat" ));
    }
}
