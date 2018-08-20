package com.groovin101.kata.intermediate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataAddReversedLinkedListsTest {

    private KataAddReversedLinkedLists kata = new KataAddReversedLinkedLists();

    @Test
    public void addTwoNumbers_singleDigitInEachList() {
        assertEquals(new ListNode(5),
                kata.addTwoNumbers(new ListNode(2), new ListNode(3)));
    }
}
