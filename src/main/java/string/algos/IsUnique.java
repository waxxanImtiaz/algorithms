package string.algos;

import java.util.HashSet;

// Should ask interviewer if String is ASCII or Unicode (We assume ASCII)

public class IsUnique {
    private static final int NUM_ASCII_CHARS = 256; // number of ASCII characters

    public static boolean uniqueCharacters(String str) {
        if (str.length() > NUM_ASCII_CHARS) {
            return false;
        }
        HashSet<Character> mySet = new HashSet(NUM_ASCII_CHARS);
        for (int i = 0; i < str.length(); i++) {
            if (mySet.contains(str.charAt(i))) {
                return false;
            } else {
                mySet.add(str.charAt(i));
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("*** Test 1.1: Unique characters?\n");
        test("Benny");
        test("Ben");
        test("Alex");
    }

    private static void test(String str) {
        System.out.format("%8s: %s%n", str, IsUnique.uniqueCharacters(str));
    }
}

//  Time Complexity: O(1)
// Space Complexity: O(1)
// Checking for str.length() > 256 lowered our time/space complexity from O(n) to O(1)

// Follow-up Question: What if we're not allowed to use additional data structures?
//
// Answer: Can do brute-force solution by comparing all pairs
// Time Complexity: O(1) since String is max 256 characters. Without this bound it would be O(n^2)
// Space Complexity: O(1)
