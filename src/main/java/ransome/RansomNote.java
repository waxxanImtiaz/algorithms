package ransome;

import java.util.*;

public class RansomNote {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Arrays.sort(magazine);
        Arrays.sort(note);

        List<String> magazineList = Arrays.asList(magazine);
        for (String n : note) {
            if (!magazineList.remove(n)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        String[] magazine = new String[]{
                "ive", "got", "a", "lovely", "bunch", "of", "coconuts"
        };

        String[] note = new String[]{
                "ive", "got", "some", "coconuts"
        };
        checkMagazine(magazine, note);
    }
}
