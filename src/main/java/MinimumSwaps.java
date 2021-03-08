import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumSwaps {
    public static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        int lenght = arr.length;
        for (int i = 0; i < lenght; i++) {
            if (i + 1 != arr[i]) {
                int t = i;

                while ((t < lenght) && (arr[t] != i + 1)) {
                    t++;
                }
                if (t < lenght) {
                    int temp = arr[t];
                    arr[t] = arr[i];
                    arr[i] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    public static int minimumSwaps(List<Integer> arr) {
        // Write your code here
        int swapCount = 0;
        int listSize = arr.size();
        for (int i = 0; i < listSize; i++) {
            if (i + 1 != arr.get(i)) {
                int t = i;
                try {
                    while ((arr.get(t) != i + 1)) {
                        t++;
                    }
                    int temp = arr.get(t);
                    arr.set(t, arr.get(i));
                    arr.set(i, temp);
                    swapCount++;
                }catch (Exception e){}
            }
        }
        return swapCount;
    }

    public static int minSwaps(List<Integer> arr, int N)
    {
        int ans = 0;
        List<Integer> temp = new ArrayList<>(arr);
        Collections.sort(temp);
        for (int i = 0; i < N; i++)
        {
            if (!arr.get(i).equals(temp.get(i)))
            {
                ans++;
                swap(arr, i, indexOf(arr, temp.get(i)));
            }
        }
        return ans;
    }
    public static void swap(List<Integer> arr, int i, int j)
    {
        int temp = arr.get(i);
        arr.add(i,arr.get(j));
        arr.add(j,temp) ;
    }
    public static  int indexOf(List<Integer> arr, int number)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i).equals(number)) {
                return i;
            }
        }
        return -1;
    }
/*
*8
1
0
1
0
0
0
0
1
* */


    /*
    *
    *
    public static int minMoves(List<Integer> arr) {
     int swapCount = 0;
        int listSize = arr.size();
        for (int i = 0; i < listSize; i++) {
            if (i + 1 != arr.get(i)) {
                int t = i;

                while ((t < listSize) && (arr.get(t) != i + 1)) {
                    t++;
                }
                if (t < listSize) {
                    int temp = arr.get(t);
                    arr.add(t,arr.get(i));
                    arr.add(i,temp) ;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
    * */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        System.out.println(minimumSwaps(arr));
//        int[] ar = new int[]{8, 1, 0, 1,0,0,0,0,1};
//        System.out.println(minSwaps(arr,arr.size()));
//        System.out.println(minimumSwaps(new int[]{8, 1, 0, 1,0,0,0,0,1}));
    }
}
