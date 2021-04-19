package string.algos;

public class MaximumNumberFromString {
    public static Integer findMaximumNumber(String numberString) {

        int slowIndex = 0;
        int num = 0;
        for (int fastIndex = 1; fastIndex < numberString.length(); fastIndex++) {
            String subStr = numberString.substring(slowIndex++, fastIndex + 1);
            int nextNum = Integer.parseInt(subStr);
            if (num < nextNum)
                num = nextNum;
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(findMaximumNumber("5088"));
    }
}
