package com.groovin101.kata.beg;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class KataReverseInteger {

    public int reverse(int x) {
        return reverse_better(x);
    }

    public int reverse_original(int x) {
        boolean isNegative = x < 0;
        try {
            if (isNegative) {
                x*=-1;
            }
            int reversed = new Integer(new StringBuilder(Integer.toString(x)).reverse().toString());
            return isNegative ? reversed*-1 : reversed;
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    // Good suggestions, pursuing similar approach to mine, but with rough edges sanded.
    // Made via this comment: leetcode.com/articles/reverse-integer/138782/Reverse-Integer/158565
    public int reverse_better(int x) {
        try {
            String reversed = new StringBuilder(Integer.toString(Math.abs(x))).reverse().toString();
            return x < 0 ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
}
