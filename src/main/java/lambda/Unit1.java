package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Unit1 {
    public static void main(String[] args) {
        Consumer<Integer[]> consumer = (integers ->  {
            if (integers.length>0)
                if (integers[0]>0)
                    System.out.println(integers[0]);
        });

        List<String> list = Arrays.asList("Imtiaz","Kamran","Amjad");
        Integer[] integers = {1,2,3,4,5};
        consumer.accept(integers);

    }
}
