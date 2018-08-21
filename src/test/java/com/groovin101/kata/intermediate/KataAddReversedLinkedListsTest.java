package com.groovin101.kata.intermediate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataAddReversedLinkedListsTest {

    private KataAddReversedLinkedLists kata = new KataAddReversedLinkedLists();

    // 2 + 3 = 5
    // (2) + (3) = (5)
    @Test
    public void addTwoNumbers_singleDigitInEachList() {
        assertEquals(new ListNode(5),
                kata.addTwoNumbers(new ListNode(2), new ListNode(3)));
    }

    // 9 + 4 = 13
    // (9) + (4) = (3)->(1)
    @Test
    public void addTwoNumbers_singleDigitInEachList_resultHasMultipleNodes() {

        ListNode expectedResult = new ListNode(3);
        expectedResult.setNext(new ListNode(1));

        assertEquals(expectedResult,
                kata.addTwoNumbers(new ListNode(9), new ListNode(4)));
    }

    // 35 + 63 = 98
    // (5)->(3) + (3)->(6) = (8)->(9)
    @Test
    public void addTwoNumbers_doubleDigitsInEachList() {

        ListNode expectedResult = new ListNode(8).setNext(new ListNode(9));

        ListNode node1 = new ListNode(5).setNext(new ListNode(3));
        ListNode node2 = new ListNode(3).setNext(new ListNode(6));

        assertEquals(expectedResult,
                kata.addTwoNumbers(node1, node2));
    }

    // 342 + 465 = 807
    // 2->4->3  +  5->6->4  =  7->0->8
    @Test
    public void addTwoNumbers_multipleDigitsInEachList() {

        ListNode expectedResult = new ListNode(8).setNext(new ListNode(0).setNext(new ListNode(7)));

        ListNode node1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode node2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));

        assertEquals(expectedResult,
                kata.addTwoNumbers(node1, node2));
    }
}
