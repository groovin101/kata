package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataReverseIntegerTest {

    @Test
    public void reverse_simpleInteger() {
        KataReverseInteger kata = new KataReverseInteger();
        assertEquals(123, kata.reverse(321));
    }

    @Test
    public void reverse_negativeInteger() {
        KataReverseInteger kata = new KataReverseInteger();
        assertEquals(-123, kata.reverse(-321));
    }

    @Test
    public void reverse_integerThatWillExceedBounds_returnZero() {
        //2^32 ~= 4295111111
        KataReverseInteger kata = new KataReverseInteger();
        assertEquals(0, kata.reverse(1111115924));
    }

    @Test
    public void reverse_dropZeroes() {
        KataReverseInteger kata = new KataReverseInteger();
        assertEquals(123, kata.reverse(321000));
    }
}
