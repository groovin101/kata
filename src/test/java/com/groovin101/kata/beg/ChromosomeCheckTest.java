package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChromosomeCheckTest {

    @Test
    public void chromosomeCheck_daughter() {
        assertEquals(KataChromosomeCheck.DAUGHTER, KataChromosomeCheck.chromosomeCheck("XX"));
    }

    @Test
    public void chromosomeCheck_son() {
        assertEquals(KataChromosomeCheck.SON, KataChromosomeCheck.chromosomeCheck("XY"));
    }

    @Test
    public void chromosomeCheck_son_reversedGametes() {
        assertEquals(KataChromosomeCheck.SON, KataChromosomeCheck.chromosomeCheck("YX"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void chromosomeCheck_() {
        KataChromosomeCheck.chromosomeCheck("Z");
    }

    @Test(expected = IllegalArgumentException.class)
    public void chromosomeCheck_nullSperm() {
        KataChromosomeCheck.chromosomeCheck(null);
    }
}
