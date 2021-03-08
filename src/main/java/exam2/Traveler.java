package exam2;

import java.util.HashMap;
import java.util.Map;

public class Traveler {

      volatile int a = 10;
    public static void main(String[] args) {
//        try{
//            String s = null;
//            System.out.println(s.toUpperCase());
//        }catch (Throwable ee){
//            System.out.println("catch");
//        }
        HashMap<String,String>  data = new HashMap<>();
        data.put(null,null);
        data.put(null,null);
        data.put(null,null);
        data.put(null,null);
        data.put(null,null);
        data.put(null,null);data.putIfAbsent("a","alpha");


       // data.put("a","alpha");
        data.forEach((key,value)->{
            System.out.println(key);
        });



//        for (Map.Entry e:data.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }



    }
}
