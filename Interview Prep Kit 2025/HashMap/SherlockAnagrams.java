package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAnagrams {

    public static int sherlockAndAnagrams(String s) {
        // Write your code here

        Map<String, Integer> cMap = new HashMap<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {

                String str = s.substring(i, j);

                char[] ch = str.toCharArray();
                Arrays.sort(ch);
                String sorted = new String(ch);

                cMap.put(sorted, cMap.getOrDefault(sorted, 0) + 1);
            }
        }

        int count = 0;
        for (int val : cMap.values())
            count += (val * (val - 1)) / 2;

        return count;

    }

    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("abba"));
        System.out.println(sherlockAndAnagrams("kkkk"));
    }
}

/**
 * Sherlock and Anagrams:
 * 
 * The goal is to count the number of unordered pairs of substrings
 * that are anagrams of each other.
 *
 * Key idea:
 * - Two substrings are anagrams if they have the same frequency of characters.
 * - We generate all possible substrings, sort each one (to normalize anagram
 * forms),
 * and store the frequency of each normalized form in a HashMap.
 * - For each normalized form that appears 'c' times, the number of unique
 * anagram pairs is:
 * (c * (c - 1)) / 2 → combinations of 2 from c items
 *
 * Example: "abba"
 * Substrings:
 * a, b, b, a, ab, bb, ba, abb, bba, abba
 * Normalized substrings:
 * a, b, b, a, ab, bb, ab, abb, abb, aabb
 * Frequency map: {a=2, b=2, ab=2, bb=1, abb=2, aabb=1}
 * Anagram pairs from counts of 2: (2 * 1) / 2 = 1 → 3 such keys = 3 pairs
 *
 * Time Complexity: O(n^3) in worst case (generating and comparing substrings),
 * but string sorting is manageable since substring lengths are short.
 */
