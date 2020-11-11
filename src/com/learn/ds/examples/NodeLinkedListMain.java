package com.learn.ds.examples;

public class NodeLinkedListMain {
    public static void main(String[] args) {
        NodeLinkedList nodeLinkedList = new NodeLinkedList(null);
        System.out.println(nodeLinkedList.isEmpty());
        nodeLinkedList.addToFront(new Node("Ram"));
        nodeLinkedList.addToFront(new Node("Sita"));
        nodeLinkedList.addToFront(new Node("Gita"));
        System.out.println(nodeLinkedList.size());



    }
}
