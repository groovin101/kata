package com.groovin101.kata.intermediate;

import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of
 * their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class KataAddReversedLinkedLists {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int totalOfNode1 = totalOfNodes(l1);
        int totalOfNode2 = totalOfNodes(l2);

        System.out.println("node1 = " + l1);
        System.out.println("node1 total = " + totalOfNode1);
        System.out.println("node2 = " + l2);
        System.out.println("node2 total = " + totalOfNode2);

        int total = totalOfNode1 + totalOfNode2;
        return buildNode(total);
    }

    private ListNode buildNode(int total) {
        ListNode node = new ListNode(total % 10);
        total /= 10;
        if (total > 0) {
            node.setNext(buildNode(total));
        }
        return node;
    }

    private int totalOfNodes(ListNode node) {
        //todo: problem is in this method here............................
        int total = node.getVal();
        //2
        if (node.getNext() != null) {
            total += node.getNext().getVal() * 10;
            //42
            totalOfNodes(node.getNext());
        }
        return total;
    }

}