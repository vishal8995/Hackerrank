import java.util.*;

public class MinAbsDiffInArray {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));
            min = Math.min(min, diff);
        }

        return min;
    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(3, -7, 0);
        System.out.println(minimumAbsoluteDifference(arr));
    }
}
