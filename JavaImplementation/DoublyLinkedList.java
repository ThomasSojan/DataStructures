package com.sample;

public class DoublyLinkedList {

    public class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }

    }

    Node head,tail;


    public void insertNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;

            head.previous = null;
            tail.next = null;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        tail.next = null;
    }

    public void forwardTraversing(){
        Node current = head;
        while(current.next != null){
            System.out.print(" ->"+current.data);
            current = current.next;
        }
        System.out.println(" ->"+current.data+" ->Null");
        System.out.println("Head:"+ head.data+" Tail:"+tail.data);
    }
    public void reverseTraversing(){
        System.out.println("");
        Node current = tail;
        while(current.previous != null){
            System.out.print(" ->"+current.data);
            current = current.previous;
        }
        System.out.print(" ->"+current.data+" ->Null\n");
    }
    public static void main(String args[]){
        DoublyLinkedList l1 = new DoublyLinkedList();
        l1.insertNode(1);
        l1.insertNode(2);
        l1.insertNode(3);
        l1.insertNode(4);
        l1.forwardTraversing();
        l1.reverseTraversing();
    }


    }


