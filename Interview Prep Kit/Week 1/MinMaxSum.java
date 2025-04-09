import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Integer> sortedArr = arr.stream().sorted().collect(Collectors.toList());
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            min += sortedArr.get(i);

        for (int i = 1; i < arr.size(); i++)
            max += sortedArr.get(i);

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws IOException {

        List<Integer> arr = Stream.of(396285104, 573261094, 759641832, 819230764, 364801279).mapToInt(Integer::valueOf)
                .boxed().toList();
        miniMaxSum(arr);
    }
}