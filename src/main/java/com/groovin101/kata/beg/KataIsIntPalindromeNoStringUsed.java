package com.groovin101.kata.beg;

public class KataIsIntPalindromeNoStringUsed implements KataIsIntPalindrome {

    @Override
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        else if (x == reverseInteger(x)) {
            return true;
        }
        return false;
    }

    //97 -> 79
    int reverseInteger(int reverseMe) {

        int reversed = 0;
        while (reverseMe > 0) {
            reversed = (reverseMe % 10) + (reversed * 10);   //(reverseMe % 10) + (reversed * 10)     =  (97 % 10) + (0 * 10)
            reverseMe = reverseMe/10;
        }
        return reversed;
    }
}
