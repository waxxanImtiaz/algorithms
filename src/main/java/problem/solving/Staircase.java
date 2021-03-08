package problem.solving;

public class Staircase {
    public static void main(String[] args) {
        print(6);
    }

    static void print(int n){

        for (int i = 0; i < n; i++){
            for(int  k = i; k<n-1; k++){
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
