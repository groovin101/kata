package com.groovin101.kata.standalone;

public class NodeSingleLink<E> {

    private E value;
    private NodeSingleLink<E> next;

    public NodeSingleLink(E value) {
        this.value = value;
    }

    public NodeSingleLink<E> getNext() {
        return next;
    }

    public void setNext(NodeSingleLink<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}