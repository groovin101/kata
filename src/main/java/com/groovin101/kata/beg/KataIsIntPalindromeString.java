package com.groovin101.kata.beg;

import java.util.Stack;

/**
 * This version uses a String conversion in its implementation. See the KataIsIntPalindromeNoStringUsed
 */
public class KataIsIntPalindromeString implements KataIsIntPalindrome {

    public boolean isPalindrome(int x) {

        Stack<String> firstHalf = new Stack<>();
        String intAsString = removeMiddleDigit(Integer.toString(x));
        int numberOfChars = intAsString.length();

        //push first half of string into a LIFO stack
        for (int i = 0; i < numberOfChars / 2; i++) {
            firstHalf.push(intAsString.substring(i, i + 1));
        }

        //traverse the latter half of string, compare to elements on stack
        for (int i = numberOfChars / 2; i < numberOfChars; i++) {
            if (!intAsString.substring(i, i + 1).equals(firstHalf.pop())) {
                return false;
            }
        }
        return true;
    }

    public String removeMiddleDigit(String intAsString) {
        if ((intAsString.length() % 2) == 0) {
            return intAsString;
        }
        return intAsString.substring(0, intAsString.length() / 2)
                + intAsString.substring((intAsString.length() / 2) + 1);
    }
}
