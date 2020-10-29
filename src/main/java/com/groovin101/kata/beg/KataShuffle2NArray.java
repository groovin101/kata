package com.groovin101.kata.beg;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/shuffle-the-array/
 *
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Example 1:
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 */
public class KataShuffle2NArray {


    public int[] shuffle(int[] inputArray, int n) {

        int[] resultAsArray = new int[inputArray.length];
        List<Integer> resultAsList = new ArrayList<>();

        //loop through the array, knowing that xs are first
        // 2n = array length, x length = n, y length = n
        for (int i = 0; i < n; i++) {
            resultAsList.add(inputArray[i]);
            resultAsList.add(inputArray[n+i]);
        }
        for (int i = 0; i < resultAsList.size(); i++) {
            resultAsArray[i] = resultAsList.get(i);
        }
        return resultAsArray;
    }

    public int[] shuffle(int[] inputArray) {

        int[] resultAsArray = new int[inputArray.length];
        List<Integer> resultAsList = new ArrayList<>();

        //loop through the array, knowing that xs are first
        // n = array length, x length = n/2, y length = n/2
        int n = inputArray.length;
        for (int i = 0; i < n/2; i++) {
            resultAsList.add(inputArray[i]);
            resultAsList.add(inputArray[n/2+i]);
        }
        for (int i = 0; i < resultAsList.size(); i++) {
            resultAsArray[i] = resultAsList.get(i);
        }
        return resultAsArray;
    }
}
