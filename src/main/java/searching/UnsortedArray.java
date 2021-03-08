package searching;

import java.util.ArrayList;
import java.util.List;

public class UnsortedArray {
    static void findNumber(List<Integer> arr, int k){

      int index = arr.indexOf( k );


        if (index == -1)
          System.out.println("NO");
      else
          System.out.println("YES");
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        arr.add(7);
        findNumber(arr,5);
    }
}
