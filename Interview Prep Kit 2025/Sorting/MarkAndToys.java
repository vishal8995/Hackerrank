package Sorting;

import java.util.*;

public class MarkAndToys {

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here

        int count = 0;
        int sum = 0;
        Collections.sort(prices);
        for (int p : prices) {
            if (p < k && p + sum <= k) {
                count++;
                sum += p;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // int k = 50;
        // List<Integer> prices = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);

        int k = 7;
        List<Integer> prices = Arrays.asList(4, 2, 3, 1);

        System.out.println(maximumToys(prices, k));

    }

}