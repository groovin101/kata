package com.groovin101.kata.beg;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KataIsIntPalindromeTest {

    KataIsIntPalindrome kata = new KataIsIntPalindrome();

    @Test
    public void isPalindrome_yes_singleDigit() {
        assertTrue(kata.isPalindrome(7));
    }

    @Test
    public void isPalindrome_yes_evenNumberOfDigits() {
        assertTrue(kata.isPalindrome(7887));
    }

    @Test
    public void isPalindrome_no_evenNumberOfDigits() {
        assertFalse(kata.isPalindrome(78));
    }

    @Test
    public void isPalindrome_no_oddNumberOfDigits() {
        assertFalse(kata.isPalindrome(789));
    }

    @Test
    public void removeMiddleDigit_OddNumberOfDigits_3() {
        assertEquals("13", kata.removeMiddleDigit("123"));
    }

    @Test
    public void removeMiddleDigit_OddNumberOfDigits_5() {
        assertEquals("1245", kata.removeMiddleDigit("12345"));
    }
}