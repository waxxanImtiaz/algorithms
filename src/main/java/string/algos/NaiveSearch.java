package string.algos;

import java.time.Duration;
import java.time.Instant;

public class NaiveSearch {
    public  static  void search(String pattern, String text){
        Instant start = Instant.now();
        // some time passes
        int count = 0;
        if (pattern == null || text == null)
            return;

        int patternSize = pattern.length();
        int textSize = text.length();


        for (int i = 0; i <= textSize - patternSize; i++){
            int j;
            for( j = 0; j < patternSize; j++)
                if (text.charAt(i + j) != pattern.charAt( j )) break;


                if (j == (patternSize))
                    count++;
//                    System.out.println("Patter found at index "+ i);
        }


//        Instant stop = Instant.now();
//        Duration d = Duration.between( start , stop );
//        long minutesPart = d.toMinutes();
//        long secondsPart = d.minusMinutes( minutesPart ).getSeconds() ;

        System.out.println(count);
    }

    public static void main(String[] args) {
        search("baa","" +
                "babaa");
    }
}
