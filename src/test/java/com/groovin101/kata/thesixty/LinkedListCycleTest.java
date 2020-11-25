package com.groovin101.kata.thesixty;

import com.groovin101.kata.intermediate.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycleTest {

    //TODO: don't forget to track your solve date and progress on your google doc!!!
    //end node pointer is null
    @Test
    public void singleNodeWithNoPointerAtTail() {
        LinkedListCycle kata = new LinkedListCycle();
        ListNode headNode = new ListNode(5);
        assertFalse(kata.hasCycle(headNode));
    }

    @Test
    public void twoNodesWithNoPointerAtTail() {
        LinkedListCycle kata = new LinkedListCycle();
        ListNode headNode = new ListNode(5);
        ListNode secondNode = new ListNode(7);
        headNode.setNext(secondNode);
        assertFalse(kata.hasCycle(headNode));
    }

    //you want to do something to make this fail; since you are simply returning a boolean, you need a positive case
    @Test
    public void twoNodesThatCycle() {
        LinkedListCycle kata = new LinkedListCycle();
        ListNode headNode = new ListNode(5);
        ListNode secondNode = new ListNode(7);
        secondNode.setNext(headNode);
        headNode.setNext(secondNode);
        assertTrue(kata.hasCycle(headNode));
    }
}
