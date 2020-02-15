package com.groovin101.kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataReverseSinglyLinkedListTest {

    @Test
    public void reverse() {

        KataReverseSinglyLinkedList kata = new KataReverseSinglyLinkedList();
        NodeSingleLink<String> abcd = buildNodeForTest();
        NodeSingleLink<String> reversedNodeList = kata.reverseListOfNodes(abcd);

        System.out.println("after reversal: " + reversedNodeList);
        NodeSingleLink<String> d = reversedNodeList;
        assertEquals("d", d.getValue());
        NodeSingleLink<String> c = d.getNext();
        assertEquals("c", c.getValue());
        NodeSingleLink<String> b = c.getNext();
        assertEquals("b", b.getValue());
        NodeSingleLink<String> a = b.getNext();
        assertEquals("a", a.getValue());
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