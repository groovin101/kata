package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverse_singleCharString() {
        assertEquals("a", KataReverseString.solution("a"));
    }

    @Test
    public void reverse_multiCharString() {
        assertEquals("abc", KataReverseString.solution("cba"));
    }

    @Test
    public void reverse_emptyString() {
        assertEquals("", KataReverseString.solution(""));
    }

    @Test(expected = NullPointerException.class)
    public void reverse_nullString() {
        KataReverseString.solution(null);
    }
}
