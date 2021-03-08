import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumOfMinimumArray {
    public static int uniqueSum(List<Integer> arr){

        HashSet<Integer> checker = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            if (checker.contains(arr.get(i))) {
                Integer temp = arr.get(i);
                temp++;
                arr.set(i,temp);
            } else {
                checker.add(arr.get(i));
            }

        }
        int sum = 0;

        for (Integer integer : arr) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(3);
        list.add(10);
        list.add(3);

        System.out.println(uniqueSum(list));
    }

}
