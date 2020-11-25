package com.groovin101.kata.thesixty;

import com.groovin101.kata.intermediate.ListNode;

import java.util.ArrayList;
import java.util.Collection;

public class LinkedListCycle {

    public boolean hasCycle(ListNode headNode) {

        Collection<ListNode> previouslySeen = new ArrayList<>();
        while (headNode != null) {
            if (previouslySeen.contains(headNode)) {
                return true;
            }
            else {
                previouslySeen.add(headNode);
            }
            headNode = headNode.getNext();
        }
        return false;
    }
}

/*
public class LinkedListCycle {

    public boolean hasCycle(ListNode headNode) {

        Set<ListNode> seen = new HashSet<>();

        while(headNode != null) {
            if (seen.contains(headNode)) {
                return true;
            }
            seen.add(headNode);
            headNode = headNode.getNext();
        }
        return false;
    }
}

 */
