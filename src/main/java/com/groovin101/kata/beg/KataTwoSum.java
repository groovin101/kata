package com.groovin101.kata.beg;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * For analysis, SEE: https://leetcode.com/articles/two-sum/
 */
public class KataTwoSum {

    /**
     * O(n^2)
     */
    public int[] twoSum_bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No matches");
    }

    /**
     * Caches result
     *
     * O(n)
     *
     */
    public int[] twoSum_twoPass(int[] nums, int sumOfTwoValues) {

        Map<Integer, Integer> valsToIndices = mapValuesToIndices(nums);

        for (int j = 0; j < nums.length; j++) {
            int numberToAddToThisOne = sumOfTwoValues - nums[j];
            if (valsToIndices.containsKey(numberToAddToThisOne)
                    && j != valsToIndices.get(numberToAddToThisOne)) {
                return new int[]{j, valsToIndices.get(numberToAddToThisOne)};
            }
        }
        throw new IllegalArgumentException("No matches");
    }

    private Map<Integer, Integer> mapValuesToIndices(int[] nums) {
        HashMap<Integer, Integer> valuesToIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            valuesToIndices.put(nums[i], i);
        }
        return valuesToIndices;
    }

    /**
     * O(n)
     */
    public int[] twoSum_singlePass(int[] nums, int sumOfTwoValues) {

        Map<Integer, Integer> valsToIndices = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int numberWeAreLookingFor = sumOfTwoValues - nums[i];
            if (valsToIndices.containsKey(numberWeAreLookingFor) && valsToIndices.get(numberWeAreLookingFor) != i) {
                return new int[] {valsToIndices.get(numberWeAreLookingFor), i};
            }
            valsToIndices.put(nums[i], i);
        }
        throw new IllegalArgumentException("no numbers found that add up to the given product of " + sumOfTwoValues);
    }
}