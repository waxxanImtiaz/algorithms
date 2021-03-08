import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Socks {

    static int sockMerchant(int n, int[] ar) {
        Set<Integer> pairs = new HashSet<>();

        int count = 0;
        for (int i = 0; i<n; i++){
            if (!pairs.contains(ar[i])){
                pairs.add(ar[i]);
            }
            else{
                pairs.remove(ar[i]);
                count++;
            }
        }

        return (count);
    }

    public static void main(String[] args) {
        int[] ar = {1,2,1,2,1,3,2};

        System.out.println(sockMerchant(ar.length, ar));

    }
}
