package com.denis.interview.algorithms.arrays.countpairstosum;

import java.util.Arrays;

/**
 *
 */
public class CountPairsToSum {

    public static int countPairsOfElementsInArray(int[] array, int target) {

        var count = 0;

        Arrays.sort(array);

        for (var item : array) {

            var search = target - item;
            var elementIndex = Arrays.binarySearch(array, search);

            if (elementIndex >= 0) {
                count++;
            }
        }
        return count / 2;
    }

    public static void main(String[] args) {

        var p = new int[]{2, 3, 5, 8, 6, 0};

        System.out.println(countPairsOfElementsInArray(p, 8));
    }

}
