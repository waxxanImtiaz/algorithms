package trees;

import java.util.*;

public class TreeSetTest {
    public void treeSetTest(){
        Set<Integer> integerSet =  new TreeSet<>(new MyComparator());

        integerSet = Collections.synchronizedSet(integerSet);
        integerSet.add(32);
        integerSet.add(10);
        integerSet.add(50);
        integerSet.add(14);
        integerSet.add(12);
        integerSet.add(200);
        System.out.println(integerSet.add(50));

        integerSet.forEach(System.out::println);


        TreeMap<String,Integer> treeMap = new TreeMap<>();

    }
    static class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2)
                return -100;
            if (o1 < o2)
                return 100;
            return 0;
        }
    }
    public static void main(String[] args) {
        TreeSetTest treeSetTest = new TreeSetTest();
        treeSetTest.treeSetTest();
    }
}
