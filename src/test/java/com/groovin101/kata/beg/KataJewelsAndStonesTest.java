package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataJewelsAndStonesTest {

    KataJewelsAndStones kata = new KataJewelsAndStones();

    @Test
    public void numJewelsInStones_none() {
        assertEquals(0, kata.numJewelsInStones("A", "a"));
    }

    @Test
    public void numJewelsInStones_one() {
        assertEquals(1, kata.numJewelsInStones("A", "A"));
    }

    @Test
    public void numJewelsInStones_multipleOfSameStone() {
        assertEquals(2, kata.numJewelsInStones("A", "AA"));
    }

    @Test
    public void numJewelsInStones_multipleDifferentStones() {
        assertEquals(5, kata.numJewelsInStones("Aab", "AAaaac"));
    }

}
