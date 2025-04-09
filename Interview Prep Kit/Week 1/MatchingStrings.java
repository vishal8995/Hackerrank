import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MatchingStrings {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. STRING_ARRAY strings
     * 2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        Map<String, Integer> stringsMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        if (strings.size() == 0) {
            result = null;
        }

        for (String string : strings) {
            if (stringsMap.containsKey(string)) {
                stringsMap.put(string, stringsMap.get(string) + 1);
            } else {
                stringsMap.put(string, 1);
            }
        }

        for (String query : queries) {
            if (stringsMap.containsKey(query)) {
                result.add(stringsMap.get(query));
            } else {
                result.add(0);
            }
        }

        return result;

    }

    public static void main(String[] args) throws IOException {

        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");

        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        List<Integer> res = matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
