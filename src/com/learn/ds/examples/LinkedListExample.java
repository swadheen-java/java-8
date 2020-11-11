package com.learn.ds.examples;

public class LinkedListExample {

    Node head;

// method to insert
  public LinkedListExample insert(LinkedListExample list, String data){
      Node newNode = new Node(data);
      if(list.head==null){
          list.head = newNode;
      }else{
          Node last = list.head;
          while(last.getNext()!= null){
              last = last.getNext();
          }
          last.setNext(newNode);
      }
      return list;
  }

  //method to delete
    public void delete(LinkedListExample list, String data){
      Node currNode = list.head;
      while(!currNode.getName().equalsIgnoreCase(data)){
          currNode = currNode.getNext();
      }
      Node nextNode = currNode.getNext();



    }

    public static void printLinkedList(LinkedListExample list){
        Node currentNode = list.head;

        while(currentNode!=null){
            System.out.println(currentNode.getName() + " ");
            currentNode = currentNode.getNext();
        }

    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list.insert(list, "swadheen");
        list.insert(list, "vishal");
        list.insert(list, "fizza");


        printLinkedList(list);

    }


}
