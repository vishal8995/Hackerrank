import java.util.HashMap;
import java.util.Map;

import javax.swing.colorchooser.ColorChooserComponentFactory;

public class MakingAnagrams {

    public static int makeAnagram(String a, String b) {
        // Write your code here
        Map<Character, Integer> aMap = new HashMap<>();
        int ctr = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            aMap.put(c, aMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            aMap.put(c, aMap.getOrDefault(c, 0) - 1);
        }

        if (!aMap.isEmpty()) {
            for (int x : aMap.values())
                ctr += Math.abs(x);
        }

        return ctr;
    }

    public static void main(String[] args) {

        // System.out.println(makeAnagram("cde", "dcf"));

        // System.out.println(makeAnagram("cde", "abc"));

        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

}
