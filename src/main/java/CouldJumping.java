import java.util.Stack;

public class CouldJumping {
    public static void main(String[] args) {
        int[] clouds = {0, 0, 1, 0, 1, 0};//0 0 1 0 0 1 0

        int n = clouds.length;

        int count = -1;

        for (int i = 0; i < n; i++, count++)
            if (i < n - 2 && clouds[i + 2] == 0)
                i++;


        System.out.println("Total jumps = " + count);
    }
}
