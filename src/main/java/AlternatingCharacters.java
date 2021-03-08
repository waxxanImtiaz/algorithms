import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AlternatingCharacters {
    static int alternating(String s) {
        int deletionRequired = 0;
        int fast = 1;

        for (int i = 0; i < s.length(); i++, fast++) {
            if (fast < s.length())
                if (s.charAt(i) == s.charAt(fast))
                    deletionRequired++;
        }

        return deletionRequired;
    }

    public static void main(String[] args) {

//        System.out.println(alternating("AAAA"));

//        Map<String,String> map = new HashMap<String,String>(comparator);
        TreeMap<String,String> treeMap = new TreeMap<>(comparator);
        treeMap.put("name2","Imtiaz");
        treeMap.put("name1","Amjad");
        treeMap.put("name6","Khadim");
        treeMap.put("name4","GM");
        treeMap.forEach((k,v) -> {
            System.out.println(k+","+v);
        });
//        treeMap.
    }
    static Comparator<String> comparator = String::compareTo;
}
