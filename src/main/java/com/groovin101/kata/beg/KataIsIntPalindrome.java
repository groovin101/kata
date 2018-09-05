package com.groovin101.kata.beg;

import java.util.Stack;

public class KataIsIntPalindrome {

    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     * <p>
     * Challenge: implement WITHOUT converting the number to a string
     *
     * @param x
     * @return
     */
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

    String removeMiddleDigit(String intAsString) {
        if ((intAsString.length() % 2) == 0) {
            return intAsString;
        }
        return intAsString.substring(0, intAsString.length() / 2)
                + intAsString.substring((intAsString.length() / 2) + 1);
    }
}