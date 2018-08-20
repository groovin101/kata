package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTwoSumTest {

    @Test
    public void twoSum() {
        int[] arrayToFindSumIn = new int[] {3,2,4};
        int sumToFind = 6;
        int[] expectedIndices = new int[] {1,2};
        assertArrayEquals(expectedIndices, new KataTwoSum().twoSum_bruteForce(arrayToFindSumIn, sumToFind));
        assertArrayEquals(expectedIndices, new KataTwoSum().twoSum_singlePass(arrayToFindSumIn, sumToFind));
        assertArrayEquals(expectedIndices, new KataTwoSum().twoSum_twoPass(arrayToFindSumIn, sumToFind));
    }

    @Test
    public void twoSum_sameNum() {
        assertArrayEquals(new int[] {0,1}, new KataTwoSum().twoSum_singlePass(new int[]{3,3}, 6));
    }
}
