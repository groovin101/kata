package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataShuffleStringTest {

    private static final KataShuffleString kata = new KataShuffleString();

    @Test
    public void restoreString_noChange() {
        String orig = "abcd";
        int[] indices = new int[]{0,1,2,3};
        assertEquals("abcd", kata.restoreString(orig, indices));
    }

    @Test
    public void restoreString() {
        String orig = "codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        assertEquals("leetcode", kata.restoreString(orig, indices));
    }
}
