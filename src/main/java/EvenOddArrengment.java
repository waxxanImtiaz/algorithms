public class EvenOddArrengment {
    public static void main(String[] args) {
        int[] x = {1, 4, 6, 3, 10,5,7,8,8};

        int pos = 0;

        for (int i = 0; i < x.length; i++) {
//            if (i != pos)
                if ((x[i] % 2 == 0) && (x[pos] % 2 == 1)) {
                    pos = i;
                } else if((x[i] % 2 == 1)) {
                    int temp = x[i];
                    x[i] = x[pos];
                    x[pos] = temp;
                    pos++;
                }

        }

        for (int j : x){
            System.out.print(j+",");
        }
    }
}
