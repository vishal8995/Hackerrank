import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BreakingRecords {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int max = scores.get(0);
        int min = scores.get(0);
        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < scores.size(); i++) {

            if (scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            } else if (scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }
        }
        return Arrays.asList(maxCount, minCount);
    }

    public static void main(String[] args) throws IOException {

        List<Integer> scores = Stream.of(12, 24, 10, 24).mapToInt(Integer::valueOf).boxed().toList();
        List<Integer> result = breakingRecords(scores);
        System.out.println(result);
    }
}