package com.github.zipcodewilmington.mylinkedlist;

public class MyLinkedList {

    MyNode head;

    public MyLinkedList(String key){
        head = new MyNode(key, null);
    }

    public MyNode getHead() {
        return head;
    }

    public void add(String key, Integer value){
        MyNode currentNode = head;
        //check if next node is null once the loop exits add the new node
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();

        }
        currentNode.setNext(new MyNode(key, value));
    }

    private void addToEnd(MyNode currentNode, MyNode n){

    }

    public void remove(Integer index){}

    public int size() {
        MyNode currentNode = head;
        //check if next node is null once the loop exits add the new node
        int counter = 1;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }

    public int find(String key) {
        return 0;}
}
