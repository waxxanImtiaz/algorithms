import java.util.HashMap;
import java.util.Map;

public class ConcateNumbers {
    public static void main(String[] args) {




        String numberString = "12345";

        Integer.parseInt(numberString);
        int number = 0;

        for (int i = 0; i < numberString.length(); i++){
            if (numberString.charAt(i) > '0' && numberString.charAt(i) < '9'){
                number *= 10;

                number += (numberString.charAt(i) - '0');
            }
        }

        System.out.println(number);
    }
}
