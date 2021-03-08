public class MaxArraySum {
    static int getSumOfSubset(int[] arr,int i,int n,int maxSum){

        int sum = 0;
        for (int j = 0; j < n; j++) {

            int pow = (int) Math.pow(2, j);
            int result = (i & (pow));


            if ((i & (pow)) > 0 && (result < n))
                sum += arr[j];
        }

        return Math.max(maxSum, sum);
    }

    static int getMaxSum(int[] arr) {
        int n = arr.length;
        int powOfTotal = (int) Math.pow(2, n);

        int maxSum = 0;
        for (int i = 0; i < powOfTotal; i++) {
            int sum = getSumOfSubset(arr, i, n, maxSum);
            if (maxSum < sum)
                maxSum = sum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        System.out.println(getMaxSum(numbers));

    }
}
