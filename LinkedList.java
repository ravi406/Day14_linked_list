package com.day14.linkedList;

public class LinkedList<T> {
    Node<T> head;


    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null)
            head = newNode;                //node being added is the first node
        else if (head.next == null)
            head.next = newNode;              //node being added is the second node
        else {
            Node<T> temp = head;
            while (temp.next != null)
                temp = temp.next;           //traverse to the last node
                temp.next = newNode;
        }
    }

}
class Node<T> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}