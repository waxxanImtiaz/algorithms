import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String s = "kamranan";

        Map<Character,Integer> count = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            if (count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
            else
                count.put(s.charAt(i),1);
        }

        for (Map.Entry e : count.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
