package com.groovin101.kata.thesixty;

import com.groovin101.kata.intermediate.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Problem 142: Linked List Cycle - exact node
 * https://leetcode.com/problems/linked-list-cycle-ii/
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 * connected to. Note that pos is not passed as a parameter.
 *
 * Notice that you should not modify the linked list.
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycleTwoTest {

    // KATA IMPLEMENTATION : tests follow below
    private class LinkedListCycleTwoChecker {

        public ListNode detectCycle(ListNode head) {

            //go through each node by traversing next()
            //if next is a node we've seen before, return current node

            List<ListNode> seen = new ArrayList<>();
            while (head.getNext() != null) {
                if (seen.contains(head)) {
                    return head;
                }
                seen.add(head);
                head = head.getNext();
            }
            return null;
        }
    }

    // input: head = [1], pos = null
    @Test
    public void noCycle() {
        ListNode singleNode = new ListNode(1);
        LinkedListCycleTwoChecker linkedListChecker = new LinkedListCycleTwoChecker();
        assertNull(linkedListChecker.detectCycle(singleNode));
    }

    // input: head = [1,2,3,4], pos = 1   (1 -> 2 - > 3 -> 4 -> 2)
    @Test
    public void tailPointsToIndex1() {
        ListNode nodeZero = new ListNode(0);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);
        nodeZero.setNext(nodeTwo).setNext(nodeThree).setNext(nodeFour).setNext(nodeTwo);

        LinkedListCycleTwoChecker linkedListChecker = new LinkedListCycleTwoChecker();
        assertEquals(nodeTwo, linkedListChecker.detectCycle(nodeZero));
    }

    // input: head = [0,2], pos = 0   (0 -> 2 -> 0)
    @Test
    public void tailPointsToHead() {
        ListNode nodeZero = new ListNode(0);
        ListNode nodeTwo = new ListNode(2);
        nodeZero.setNext(nodeTwo).setNext(nodeZero);

        LinkedListCycleTwoChecker linkedListChecker = new LinkedListCycleTwoChecker();
        assertEquals(nodeZero, linkedListChecker.detectCycle(nodeZero));
    }

}
