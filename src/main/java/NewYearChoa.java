public class NewYearChoa {
    public static void main(String[] args) {
        int q[] = {1,2,3,5,4,6,7,8};


        int ans = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) ans++;
        }

        System.out.println(ans);
    }
}
