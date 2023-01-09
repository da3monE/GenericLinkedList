package org.example.genericLinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericLinkedList<T> {
    private final static Logger LOGGER = LogManager.getLogger(GenericLinkedList.class);

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void addFront(T value){
        if(isEmpty()){
            head = new Node(value);
            tail = head;
            return;
        }

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addBack(T value){
        if(isEmpty()){
            head = new Node(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }

    public void addAnywhereInlist(int position, T value){
        if(position == 1){
            addFront(value);
            return;
        }

        Node current = head;
        int count = 1;

        while(count < position - 1){
            count++;
            current = current.next;
        }

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    public T deleteNodeFront(){
        if(isEmpty()){
            throw new RuntimeException("Error: The Generic Linked List is empty.");
        }

        Node current = head;
        head = head.next;
        current.next = null;
        return current.value;
    }

    public T deleteNodeBack(){
        if(isEmpty()){
            throw new RuntimeException("Error: The Generic Linked List is empty.");
        }
        else if(head == tail){
            T value = head.value;
            head = null;
            tail = null;
            return value;
        }
        Node current = head;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        tail = previous;
        return current.value;
    }

    public T deleteNodeAnywhere(int position){
        if(isEmpty()){
            throw new RuntimeException("Error: The Generic Linked List is empty.");
        }
        else if(position == 1){
            deleteNodeFront();
        }

        Node current = head;
        Node previous = null;
        int count = 1;

        while(count < position){
            count++;
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        current.next = null;
        return current.value;
    }

    public boolean isNodeInList(T value){
        Node current = head;

        while(current != null){
            if (value == current.value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printNode(){
        Node current = head;

        while(current != null){
            LOGGER.info(current.value + " , ");
            current = current.next;
        }
        LOGGER.info("\n");
    }

    class Node{
        T value;
        Node next;

        Node(T value){
            this.value = value;
        }
    }
}
