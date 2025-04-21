import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {

    // Plain Recursion
    // Classic Recursion for smaller values of n
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Bottom-Up DP (Tabulation)
    // Dynamic Programming solution with memoization for larger values of n (Without
    // Recursion)
    // Time Complexity: O(n); Space Complexity: O(n)
    public static int fibonacciON(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    // Optimized Bottom-Up (2 vars)
    // Dynamic Programming solution with memoization for larger values of n (Without
    // Recursion)
    // Time Complexity: O(n); Space Complexity: O(1)
    public static int fibonacciO1(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    // Top-Down DP (Memoization)
    // Dynamic Programming solution with memoization for larger values of n (With
    // Recursion)
    // O(n) Space; O(n) Time
    public static int fibonacciRec(int n, int[] memo) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (memo[n] != -1)
            return memo[n];

        memo[n] = fibonacciRec(n - 1, memo) + fibonacciRec(n - 2, memo);
        return memo[n];

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n)); // Recursion
        System.out.println(fibonacciON(n)); // DP O(n) Space
        System.out.println(fibonacciO1(n)); // DP O(1) Space

        // DP with Recursion
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fibonacciRec(n, memo));
    }
}
