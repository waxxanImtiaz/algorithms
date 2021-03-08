package hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("i","jj");

        map.put(null,"asdfasf");
        map.put(null,"dfdfd");
        map.put("k","kk");



        System.out.println(map.get(null));

    }
}
