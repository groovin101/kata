package com.groovin101.kata.beg;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class KataShuffle2NArrayTest {

    @Test
    public void shuffle() {
        KataShuffle2NArray kata = new KataShuffle2NArray();
        int[] inputArray = {1,2,3,4};
        int[] expectedResult = {1,3,2,4};
        assertArrayEquals(expectedResult, kata.shuffle(inputArray));
    }

    @Test
    public void shufflePassingN() {
        KataShuffle2NArray kata = new KataShuffle2NArray();
        int[] inputArray = {1,2,3,4};
        int[] expectedResult = {1,3,2,4};
        assertArrayEquals(expectedResult, kata.shuffle(inputArray, 2));
    }

}
