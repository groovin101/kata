package com.groovin101.kata.beg;

import java.util.Arrays;

/**
 * Source: https://leetcode.com/problems/non-decreasing-array/
 *
 * 665. Non-decreasing Array
 *
 * Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
 *
 * Example 1:
 *
 * Input: nums = [4,2,3]
 * Output: true
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 */
public class KataNonDecreasingArrayPossibleChecker {

    public boolean checkPossibility(int[] nums) {
        //int[] nums2 = Arrays.copyOf(nums, nums.length);
        return checkPossibility_THISWORKS(nums);
        //return checkPossibility_solutionTwo(nums);
    }

    public boolean checkPossibility_solutionTwo(int[] nums) {

        //the trick here is to remember that we may have to adjust different numbers, either the current one
        //we are examining, or... think about a few scenarios
        return true;
    }

    public boolean checkPossibility_THISWORKS(int[] nums) {

        boolean weHaveModifiedAValue = false;

        //if we see that the number after the current number is less than (decreasing array), we
        // need to bump either the current OR the next number to ensure that all numbers are non-decreasing
        for (int i = 0; i < nums.length-1; i++) {

            //if the number after this one is not greater than or equal to this number
            if (nums[i] > nums[i+1]) {
                if (weHaveModifiedAValue) {
                    return false;
                }
                else {
                    //if index is the first member examined OR the last number we can examine
                    if (i == 0 || (i == nums.length - 2)
                            //OR the previous number is <= the next number
                            || (nums[i - 1] <= nums[i + 1])) {
                        //set current number to the next number's value
                        nums[i] = nums[i + 1];
                    }
                    //if the current number is <= the one after next, set the current num to the one
                    // after next's value to ensure it is at least as big as that one
                    else if (nums[i] <= nums[i + 2]) {
                        nums[i + 1] = nums[i + 2];
                    }
                    else {
                        return false;
                    }
                    weHaveModifiedAValue = true;
                }
            }
        }
        return true;
    }
}
