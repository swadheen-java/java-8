package com.learn.ds.examples;

public class NodeLinkedList {
    private Node head;
    private int size;

    public NodeLinkedList(Node head) {
        this.head = head;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        return size;
    }

    public void addToFront(String string1){
       Node node = new Node(string1);
       node.setNext(head);
       head =  node;
       size++;

    }
}
