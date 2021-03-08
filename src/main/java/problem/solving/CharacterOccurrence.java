package problem.solving;

public class CharacterOccurrence {
    public static void main(String[] args) {
//        System.out.println(repeatedString("aaabcsaad",30));
    }

    public long repeatedString(String s, long n){
        long count = 0;
        long stringSize = s.length();
        int stringIndex = 0;
        char[] characters = s.toCharArray();

        for (int i = 0; i<n; i++){
            if (stringIndex == stringSize)
                stringIndex = 0;

            if (characters[stringIndex] == 'a'){
                count++;
            }
            stringIndex++;
        }
        return count;

    }
}
