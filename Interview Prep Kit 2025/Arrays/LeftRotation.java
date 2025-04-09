package Arrays;

import java.util.Arrays;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here

        int len = a.size();
        int k = d % len;
        System.out.println(k);

        reverse(a, 0, k - 1);
        reverse(a, k, len - 1);
        reverse(a, 0, len - 1);

        return a;
    }

    public static void reverse(List<Integer> l, int start, int end) {

        while (start < end) {
            int temp = l.get(start);
            l.set(start, l.get(end));
            l.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        int rotation = 2;

        System.out.println(rotLeft(l, rotation));

    }
}

/*
 * Array Rotation using Reversal Algorithm
 *
 * For LEFT rotation by d positions:
 * Example: [1, 2, 3, 4, 5], d = 2 → [3, 4, 5, 1, 2]
 *
 * Method 1 (classic):
 * 1. Reverse first k elements → reverse(0, k - 1)
 * 2. Reverse remaining elements → reverse(k, n - 1)
 * 3. Reverse the entire array → reverse(0, n - 1)
 *
 * Method 2 (alternative):
 * 1. Reverse entire array → reverse(0, n - 1)
 * 2. Reverse first (n - k) elements → reverse(0, n - k - 1)
 * 3. Reverse last k elements → reverse(n - k, n - 1)
 *
 * For RIGHT rotation by d positions:
 * Example: [1, 2, 3, 4, 5], d = 2 → [4, 5, 1, 2, 3]
 *
 * Right rotation is same as left rotation by (n - k)
 *
 * Method 1 (classic):
 * 1. Reverse last k elements → reverse(n - k, n - 1)
 * 2. Reverse first (n - k) elements → reverse(0, n - k - 1)
 * 3. Reverse entire array → reverse(0, n - 1)
 *
 * Method 2 (alternative):
 * 1. Reverse entire array → reverse(0, n - 1)
 * 2. Reverse first k elements → reverse(0, k - 1)
 * 3. Reverse remaining elements → reverse(k, n - 1)
 *
 * Important:
 * - Normalize rotations using: k = d % n
 * This ensures we rotate only necessary times, even if d > n
 *
 * Variable Meaning:
 * - n = array size
 * - d = number of positions to rotate
 * - k = normalized rotation count (d % n)
 */
