package com.groovin101.kata.standalone;

import org.junit.Test;

public class KataReverseSinglyLinkedList {

    @Test
    public void reverse() {

        NodeSingleLink<String> abcd = buildNodeForTest();
        NodeSingleLink<String> reversedNodeList = reverseListOfNodes(abcd);
        System.out.println("after reversal: " + reversedNodeList);
    }

    private NodeSingleLink<String> reverseListOfNodes(NodeSingleLink<String> master) {

        NodeSingleLink<String> current = master;
        NodeSingleLink<String> previous = null;
        NodeSingleLink<String> next;

        //a [b] c d
        //swap current node's prev and next values, then set the current value to what was next and repeat
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous; //(remember, current is now null so previous must be our last element)
    }

    private NodeSingleLink<String> buildNodeForTest() {
        NodeSingleLink<String> nodeA = new NodeSingleLink<>("a");
        NodeSingleLink<String> nodeB = new NodeSingleLink<>("b");
        NodeSingleLink<String> nodeC = new NodeSingleLink<>("c");
        NodeSingleLink<String> nodeD = new NodeSingleLink<>("d");
        nodeC.setNext(nodeD);
        nodeB.setNext(nodeC);
        nodeA.setNext(nodeB);
        System.out.println("before reversal: " + nodeA);
        return nodeA;
    }
}