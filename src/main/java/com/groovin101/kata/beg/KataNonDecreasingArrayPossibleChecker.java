package com.groovin101.kata.beg;

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
        return checkPossibility_THISWORKS(nums) && checkPossibility_solutionTwo(nums);
    }

    public boolean checkPossibility_solutionTwo(int[] nums) {

        //loop through each number in the set
        // if the next number (assuming there is one) is less than the current indexed num val, then
        // we need to adjust *something*
        // given an order x, y, z, current index x, where x >= y < z, we need to modify either y or
        // modify z. How to choose which? Let's not get ahead of ourselves. Let's pick one and run
        // our test through it

        boolean weHaveModifiedTheArray = false;

        //int[] nums = new int[]{5,7,1,8};
        for (int i = 0; i < nums.length - 1; i++) {
            //if the next number is bigger than this one, then we are increasing, NOT non-decreasing
            //that means we need to change either the current indexed number OR the next-indexed number
            //to ensure that the current one will be <= the next number, but ALSO >= the previous number
            if (nums[i + 1] < nums[1]) {
                if (weHaveModifiedTheArray) {
                    return false;
                }
                else if (nums[i] < nums[i+1]) {
                    nums[i] = nums[i+1];
                }
                else {
                    nums[i + 1] = nums[i];
                }
                weHaveModifiedTheArray = true;
            }
        }
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
