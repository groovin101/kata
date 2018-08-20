package com.groovin101.kata.beg;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataRomanNumeralToIntTest {

    private KataRomanNumeralToInt kata;

    @Before
    public void init() {
        kata = new KataRomanNumeralToInt();
    }

    @Test
    public void input_I() {
        assertEquals(1, kata.romanToInt("I"));
    }

    @Test
    public void input_II() {
        assertEquals(2, kata.romanToInt("II"));
    }

    @Test
    public void input_XV() {
        assertEquals(15, kata.romanToInt("XV"));
    }

    @Test
    public void input_IV_smallNumberBeforeLargerNumber() {
        assertEquals(4, kata.romanToInt("IV"));
    }

    @Test
    public void input_IX_smallNumberBeforeLargerNumber() {
        assertEquals(9, kata.romanToInt("IX"));
    }

    @Test
    public void input_LVIII() {
        assertEquals(58, kata.romanToInt("LVIII"));
    }

    @Test
    public void input_MCMXCIV() {
        assertEquals(1994, kata.romanToInt("MCMXCIV"));
    }
}
