package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadProductVersionTest {

    @Test
    public void firstBadVersion() {
        assertEquals(4, new KataFirstBadProductVersion(4).firstBadVersion(5));
    }

    @Test
    public void firstBadVersion_lotsaVersions() {
        assertEquals(8, new KataFirstBadProductVersion(8).firstBadVersion(932));
    }

    // --00----05----10----15----20----25----30--     //12 as firstBadVersion
    @Test
    public void firstBadVersion_twelveVersions() {
        assertEquals(12, new KataFirstBadProductVersion(12).firstBadVersion(30));
    }
}
