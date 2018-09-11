package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadProductVersionTest {

    @Test
    public void firstBadVersion() {
        assertEquals(4, new KataFirstBadProductVersion(4).firstBadVersion(5));
    }
}
