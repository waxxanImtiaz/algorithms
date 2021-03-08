package arrays;

import java.util.HashSet;
import java.util.Set;

public class LonelyInteger {
    static int findLonelyInteger(int[] arr){
        HashSet<Integer> checker = new HashSet<>();
        for (int j : arr) {
            if (!checker.add(j)) {
                checker.remove(j);
            }
        }
        return checker.iterator().next();
    }
    public static int lonelyInteger(int [] array) {
        int val = 0;
        for (int num : array) {
            val = val ^ num; // ^ is XOR operator
        }
        return val;
    }
    public static void main(String[] args) {
//        4 9 95 93 57 4 57 93 9
        int[] arr = new int[]{4,9,95,93,57,4,57,93,9};
        System.out.println(lonelyInteger(arr));
    }
}
