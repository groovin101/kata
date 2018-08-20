package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KataIsIntPalindromeTest {

    @Test
    public void isPalindrome_yes_singleDigit() {
        KataIsIntPalindrome kata = new KataIsIntPalindrome();
        assertTrue(kata.isPalindrome(7));
    }
}
