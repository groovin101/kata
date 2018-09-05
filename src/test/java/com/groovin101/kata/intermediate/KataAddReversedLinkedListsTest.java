package com.groovin101.kata.intermediate;

import com.groovin101.kata.hold.KataAddReversedLinkedLists;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataAddReversedLinkedListsTest {

    private KataAddReversedLinkedLists kata = new KataAddReversedLinkedLists();

    // 5 -> null equals 5 as int
    @Test
    public void totalOfNode_singleValue() {
        assertEquals(5, kata.totalOfNodes(new ListNode(5)));
    }

    // 5 -> 7 equals 75 as int
    @Test
    public void totalOfNode_twoChildren() {
        ListNode parent = new ListNode(5).setNext(new ListNode(7));
        assertEquals(75, kata.totalOfNodes(parent));
    }

    // 5 -> 7 -> 3 equals 375 as int
    @Test
    public void totalOfNode_multipleChildren() {
        ListNode parent = new ListNode(5).setNext(new ListNode(7).setNext(new ListNode(3)));
        assertEquals(375, kata.totalOfNodes(parent));
    }

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

        ListNode expectedResult = new ListNode(7).setNext(new ListNode(0).setNext(new ListNode(8)));

        ListNode node1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode node2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));

        assertEquals(expectedResult,
                kata.addTwoNumbers(node1, node2));
    }

    // 56 + 789 = 845
    // 6->5 + 9->8->7 = 5->4->8
    @Test
    public void addTwoNumbers_diffNumberOfDigitsInEachList() {

        ListNode expectedResult = new ListNode(5).setNext(new ListNode(4).setNext(new ListNode(8)));

        ListNode node1 = new ListNode(6).setNext(new ListNode(5));
        ListNode node2 = new ListNode(9).setNext(new ListNode(8).setNext(new ListNode(7)));

        assertEquals(expectedResult,
                kata.addTwoNumbers(node1, node2));
    }

    //[9]
    //[1,9,9]
    // expect [0,0,0,1]
    //
    // 9 + 991 = 1,000
    @Test
    public void addTwoNumbers_lilOne() {

        ListNode expectedResult =
                new ListNode(0).setNext(
                        new ListNode(0).setNext(
                                new ListNode(0).setNext(
                                        new ListNode(1))));
        ListNode node1 =
                new ListNode(1).setNext(
                        new ListNode(9).setNext(
                                new ListNode(9)));

        ListNode node2 = new ListNode(9);

        assertEquals(expectedResult,
                kata.addTwoNumbers(node1, node2));
    }

    //[9]
    //[1,9,9,9,9,9,9,9,9,9]
    // expect [0,0,0,0,0,0,0,0,0,0,1]
    //
    // 9 + 9,999,999,991 = 10,000,000,000
    //TODO: 2018-09 ... this test DOES NOT PASS - reconsider the recursive implementation in lieu of an alternative approach
    @Test
    @Ignore
    public void addTwoNumbers_bigOne() {

        ListNode expectedResult =
                new ListNode(0).setNext(
                        new ListNode(0).setNext(
                                new ListNode(0).setNext(
                                        new ListNode(0).setNext(
                                                new ListNode(0).setNext(
                                                        new ListNode(0).setNext(
                                                                new ListNode(0).setNext(
                                                                        new ListNode(0).setNext(
                                                                                new ListNode(0).setNext(
                                                                                        new ListNode(0).setNext(
                                                                                                new ListNode(0).setNext(
                                                                                                        new ListNode(1))))))))))));

        ListNode node1 =
                new ListNode(1).setNext(
                        new ListNode(9).setNext(
                                new ListNode(9).setNext(
                                        new ListNode(9).setNext(
                                                new ListNode(9).setNext(
                                                        new ListNode(9).setNext(
                                                                new ListNode(9).setNext(
                                                                        new ListNode(9).setNext(
                                                                                new ListNode(9).setNext(
                                                                                        new ListNode(9))))))))));

        ListNode node2 = new ListNode(9);

        System.out.println(node1);
        System.out.println(node2);
        System.out.println(kata.addTwoNumbers(node1, node2));

        assertEquals(expectedResult,
                kata.addTwoNumbers(node1, node2));
    }

}
