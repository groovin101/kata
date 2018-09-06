package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataIsIntPalindromeNoStringUsedTest {

    KataIsIntPalindromeNoStringUsed kata = new KataIsIntPalindromeNoStringUsed();

    @Test
    public void isPalindrome_yes_singleDigit() {
        assertTrue(kata.isPalindrome(7));
    }

    @Test
    public void isPalindrome_no_twoDigit() {
        assertFalse(kata.isPalindrome(78));
    }

    @Test
    public void isPalindrome_no_negativeNumber() {
        assertFalse("negative number cannot be palindrome", kata.isPalindrome(-7));
    }

    @Test
    public void reverseInteger_singleDigit() {
        assertEquals(9, kata.reverseInteger(9));
    }

    @Test
    public void reverseInteger_doubleDigit() {
        assertEquals(79, kata.reverseInteger(97));
    }

//    @Test
//    public void isPalindrome_yes_evenNumberOfDigits() {
//        assertTrue(kata.isPalindrome(7887));
//    }
//
//    @Test
//    public void isPalindrome_no_evenNumberOfDigits() {
//        assertFalse(kata.isPalindrome(78));
//    }
//
//    @Test
//    public void isPalindrome_no_oddNumberOfDigits() {
//        assertFalse(kata.isPalindrome(789));
//    }
}