package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersion() {
        assertEquals(4, new KataFirstBadVersion().firstBadVersion(5));
    }
}
