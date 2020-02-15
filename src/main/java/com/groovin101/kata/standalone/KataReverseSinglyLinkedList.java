package com.groovin101.kata.standalone;

public class KataReverseSinglyLinkedList {

    NodeSingleLink<String> reverseListOfNodes(NodeSingleLink<String> master) {

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
}
