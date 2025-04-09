package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String, Integer> magMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();
        boolean canConstruct = true;

        for (String s : magazine) {
            magMap.put(s, magMap.getOrDefault(s, 0) + 1);
        }

        for (String s : note) {
            noteMap.put(s, noteMap.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (magMap.getOrDefault(word, 0) < count)
                canConstruct = false;
        }

        System.out.println(canConstruct ? "Yes" : "No");
    }

    public static void main(String[] args) {

        List<String> magazine1 = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note1 = Arrays.asList("give", "one", "grand", "today");

        List<String> magazine2 = Arrays.asList("attack", "at", "dawn");
        List<String> note2 = Arrays.asList("Attack", "at", "dawn");

        checkMagazine(magazine1, note1);
        checkMagazine(magazine2, note2);
    }
}
