package Sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int ctr = 0;
        int len = a.size();

        for (int i = 0; i < len; i++) { // For 1 Pass
            for (int j = 0; j < len - 1; j++) { // For bubbling the largest to the end

                if (a.get(j) > a.get(j + 1)) {

                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);

                    ctr++;
                }
            }
        }

        System.out.printf("Array is sorted in %d swaps.%n", ctr);
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(len - 1));

    }

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(7, 6, 3, 1, 4, 5, 2);
        countSwaps(l);
    }
}
