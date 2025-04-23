import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes = 0;

        for (int i = 0; i < q.size(); i++) {

            int current = q.get(i); // 5 i= 4
            if (current - (i + 1) > 2) { // 5 - 5 !> 2
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, current - 2); j < i; j++) {
                if (q.get(j) > current)
                    bribes++;
            }

        }

        System.out.println(bribes);
    }

    public static void main(String[] args) {

        List<Integer> a1 = Arrays.asList(2, 1, 5, 3, 4);
        List<Integer> a2 = Arrays.asList(2, 5, 1, 3, 4);
        List<Integer> a3 = Arrays.asList(1, 2, 5, 3, 4, 7, 8, 6);
        List<Integer> a4 = Arrays.asList(5, 1, 2, 3, 7, 8, 6, 4);
        List<Integer> a5 = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);

        // minimumBribes(a1);
        // minimumBribes(a2);
        // minimumBribes(a3);
        minimumBribes(a4);
        minimumBribes(a5);
    }
}

/**
 * Approach:
 * - For each person in the queue, check how far they've moved from their
 * original position.
 * If anyone has moved more than 2 positions ahead, print "Too chaotic".
 *
 * - Then, for each person, count how many people with higher numbers are ahead
 * of them
 * (i.e., who must have bribed them).
 * We only check from (original position - 2) to current index to limit
 * unnecessary checks.
 *
 * Time Complexity: O(n)
 * - Each person is checked at most twice (because they can bribe at most 2
 * people).
 * - So total comparisons are limited → efficient linear solution.
 */