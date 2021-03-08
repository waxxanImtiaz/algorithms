import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static void main(String[] args) {
        int[] data = {2,3,4,5,6,7};


//        for(int i = 0; i< data.length;i++){
//            int num = data[i];
//            for (int j = i+1; j< data.length; j++){
//                num = data[j]+ num;
//                num = data[i];
//
//
//            }
//        }

        Integer[] array = new Integer[]{ 1, 4, 5};
        Set<Integer> b = new HashSet<Integer>();
        // from an array variable
        b.addAll( Arrays.asList( 8, 9, 10));

    }


}


class PowerSet {

    static <T> Set<Set<T>> powerSet( Set<T> set ) {
//        T[] element = (T[]) set.toArray();
//        final int SET_LENGTH = 1 << element.length;
//        Set<Set<T>> powerSet = new HashSet<>();
//        for( int binarySet = 0; binarySet < SET_LENGTH; binarySet++ ) {
//            Set<T> subset = new HashSet<>();
//            for( int bit = 0; bit < element.length; bit++ ) {
//                int mask = 1 << bit;
//                if( (binarySet & mask) != 0 ) {
//                    subset.add( element[bit] );
//                }
//            }
//            powerSet.add( subset );
//        }
        return null;
    }

    public static void main(String[] args) {
//        Set<Character> test = new HashSet<>();
//        test.add( 'a' );
//        test.add( 'b' );
//        test.add( 'c' );
//        System.out.println("test = " + test);
//        Set<Set<Character>> result = powerSet( test );
//        System.out.println( result );
    }
}