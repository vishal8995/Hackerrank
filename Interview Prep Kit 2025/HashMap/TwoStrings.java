package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Map<Character, Integer> cMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            cMap.put(ch, cMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (cMap.containsKey(ch))
                return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("ant", "art"));
    }

}
