import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class DivisibleSumPairs {

    //////////////////////////////////////////////////// Geeks for Geeks Solution
    //////////////////////////////////////////////////// ////////////////////////////////////////////////////////////

    // public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // // Write your code here
    // int freq[] = new int[k];

    // // Count occurrences of all remainders
    // for (int i = 0; i < n; i++)
    // ++freq[ar.get(i) % k];

    // // for(int i = 0; i < k; i++)
    // // System.out.println(freq[i]);

    // // System.out.println(freq[0]);
    // // System.out.println(freq[0]-1);

    // // If both pairs are divisible by 'k'
    // int sum = freq[0] * (freq[0] - 1) / 2;
    // System.out.println(sum);

    // // count for all i and (k-i)
    // // freq pairs
    // for (int i = 1; i <= k / 2 && i != (k - i); i++){

    // System.out.println(freq[i] * freq[k - i]);
    // sum += freq[i] * freq[k - i];
    // System.out.println(sum);
    // }

    // // If k is even
    // if (k % 2 == 0){

    // System.out.println(freq[k / 2] * (freq[k / 2] - 1) / 2);
    // sum += (freq[k / 2] * (freq[k / 2] - 1) / 2);
    // System.out.println(sum);
    // }

    // return sum;
    // }

    //////////////////////////////////////////////////// Hackerrank Contributor
    //////////////////////////////////////////////////// Solution
    //////////////////////////////////////////////////// ////////////////////////////////////////////////////////////
    // Converted to Java

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int noOfPairs = 0;

        for (int i = 0; i < n; i++) {
            int remainder = ar.get(i) % k;
            int difference = k - remainder;

            if (difference == k) { // ar[i] is divisible by k
                difference = 0;
            }

            if (frequencyMap.containsKey(difference)) {
                noOfPairs += frequencyMap.get(difference);
            }

            if (frequencyMap.containsKey(remainder)) {
                frequencyMap.put(remainder, frequencyMap.get(remainder) + 1);
            } else {
                frequencyMap.put(remainder, 1);
            }
        }

        return noOfPairs;
    }

    public static void main(String[] args) throws IOException {

        int n = 6, k = 4;

        List<Integer> ar = Stream.of(2, 2, 1, 7, 5, 3).mapToInt(Integer::valueOf).boxed().toList();

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);

    }
}
