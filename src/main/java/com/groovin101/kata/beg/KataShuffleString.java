package com.groovin101.kata.beg;

/**
 * Source: https://leetcode.com/problems/shuffle-string/
 *
 * Given a string s and an integer array indices of the same length.
 *
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 *
 * Example 1:
 *
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */
public class KataShuffleString {

    public String restoreString(String orig, int[] indices) {
        return restoreStringUsingPrimitiveArray(orig, indices);
        //return restoreStringUsingObjects(orig, indices);
    }

    public String restoreStringUsingPrimitiveArray(String orig, int[] indices) {
        char[] result = new char[orig.length()];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = orig.charAt(i);
        }
        return new String(result);
    }

    public String restoreStringUsingObjects(String orig, int[] indices) {
        StringBuffer result = new StringBuffer(orig);
        //examine each index one by one, take each one, grab the char at loop counter from orig String, and insert into new String at index X
        for (int i = 0; i < orig.length(); i++) {
            int nextIndex = indices[i];
            result.replace(nextIndex, nextIndex+1, String.valueOf(orig.charAt(i)));
        }
        return result.toString();
    }
}