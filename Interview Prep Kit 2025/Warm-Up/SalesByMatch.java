import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        Map<Integer, Integer> pairMap = new HashMap<>();

        for (int val : ar) {
            int count = pairMap.getOrDefault(val, 0) + 1;
            pairMap.put(val, count);
            if (count % 2 == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {

        // List<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50,
        // 10, 20));

        List<Integer> ar = new ArrayList<>(Arrays.asList(
                44, 55, 11, 15, 4, 72, 26, 91, 80, 14,
                43, 78, 70, 75, 36, 83, 78, 91, 17, 17,
                54, 65, 60, 21, 58, 98, 87, 45, 75, 97,
                81, 18, 51, 43, 84, 54, 66, 10, 44, 45,
                23, 38, 22, 44, 65, 9, 78, 42, 100, 94,
                58, 5, 11, 69, 26, 20, 19, 64, 64, 93,
                60, 96, 10, 10, 39, 94, 15, 4, 3, 10,
                1, 77, 48, 74, 20, 12, 83, 97, 5, 82,
                43, 15, 86, 5, 35, 63, 24, 53, 27, 87,
                45, 38, 34, 7, 48, 24, 100, 14, 80, 54));

        // List<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 30));

        int n = ar.size();
        System.out.println(sockMerchant(n, ar));
    }

}
