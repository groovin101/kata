package com.groovin101.kata.hold;

import com.groovin101.kata.intermediate.ListNode;

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

    public ListNode addTwoNumbers(ListNode listNodeOne, ListNode listNodeTwo) {

        int totalOfNode1 = totalOfNodes(listNodeOne);
        int totalOfNode2 = totalOfNodes(listNodeTwo);

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

    /**
     * Take a LinkedList and turn it into a decimal. (2 -> 4 -> 3) should output 243
     * @param node
     * @return
     */
    public int totalOfNodes(ListNode node) {
        if (node.getNext() == null) {
            return node.getVal();
        }
        else {
            return node.getVal() + (totalOfNodes(node.getNext())*10);
        }
    }

}