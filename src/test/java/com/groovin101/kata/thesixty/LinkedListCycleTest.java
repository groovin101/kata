package com.groovin101.kata.thesixty;

import com.groovin101.kata.intermediate.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Problem 141: Linked List Cycle - yes/no
 * https://leetcode.com/problems/linked-list-cycle/
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 * connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */
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
