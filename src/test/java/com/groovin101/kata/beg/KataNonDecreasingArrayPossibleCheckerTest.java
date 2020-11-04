package com.groovin101.kata.beg;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KataNonDecreasingArrayPossibleCheckerTest {

    private KataNonDecreasingArrayPossibleChecker kata;
    @Before
    public void init() {
        kata = new KataNonDecreasingArrayPossibleChecker();
    }

    @Test
    public void checkPossibility_false() {
        int[] nums = new int[]{3,4,2,3};
        assertFalse(kata.checkPossibility(nums));
    }

    @Test
    public void checkPossibility_true() {
        int[] nums = new int[]{4,2,3};
        assertTrue(kata.checkPossibility(nums));
    }

    @Test
    public void checkPossibility_true_4digits() {
        int[] nums = new int[]{5,7,1,8};
        assertTrue(kata.checkPossibility(nums));
    }

    @Test
    public void checkPossibility_true_5digits() {
        int[] nums = new int[]{1,2,4,5,3};
        assertTrue(kata.checkPossibility(nums));
    }
}