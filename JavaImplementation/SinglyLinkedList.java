package com.dataStructures;

public class SinglyLinkedList {
    static class Node{
        int data;
        Node next;
    }
    Node head,tail;
    int length = 0;

// INSERT NODE AT START POSITION

    void insertStart(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;


        if (head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        length++;
        }


// INSERT NODE AT END POSITION

    void insertEnd(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;
        if(head == null) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        length++;
    }

// INSERT NODE AT SPECIFIC POSITION
    
    void insertPosition(int index,int value){
        Node node = new Node();
        node.data = value;
        node.next = null;
        if(index ==0){
            insertStart(value);
        }
        else if(index == length){
            insertEnd(value);
        }
        else {

            int indexCounter = 0;
            Node current = head;
            while (indexCounter < index - 1) {
                current = current.next;
                indexCounter++;
            }
            node.next = current.next;
            current.next = node;
            length++;
        }

    }
    
    

// DELETE NODE AT START POSITION
    void deleteStart(){
        if(head == null){
            System.out.println("Linked List Empty");
        }
        else{
            head = head.next;
            length--;
        }
    }

// DELETE NODE AT END POSITION

    void deleteEnd(){
        if(head == null){
            System.out.println("Linked List Empty");
        }
        else{
            if(head != tail){
                Node current = head;
                while(current.next != tail){
                    current = current.next;
                }
                tail = current;
                tail.next = null;
                length--;
            }
            else{
                head = tail =null;
            }


        }

    }



// DELETE NODE AT SPECIFIC POSITION

    void deletePos(int index){
        if(index == 0)
            deleteStart();
        else if(index == length-1)
            deleteEnd();
        else{
            Node current = head;
            for(int i = 0;i<index-1;i++){
                current = current.next;
            }
           Node temp = current.next;
           current.next = temp.next;
           length--;
        }
    }

//UPDATE VALUE AT START POSITION
    void updateStart(int data){
        if(head==null){
            System.out.println("List is Empty...");
        }
        else{
            head.data = data;
        }
    }


//UPDATE VALUE AT END POSITION
    void updateEnd(int data){
        if(head==null){
            System.out.println("List is Empty...");
        }
        else{
            tail.data = data;
        }
    }


//UPDATE VALUE AT SPECIFIC POSITION
    void updatePos(int index,int value){
        if(head==null){
            System.out.println("List is Empty...");
        }
        if(index == 0){
            updateStart(value);
        }
        else if(index == length-1){
            updateEnd(value);
        }
        else{
            Node current = head;
            for(int i = 0;i < index;i++){
                current = current.next;
            }
            current.data = value;

        }

    }



//DISPLAY LINKED LIST BY TRAVERSING

    void display(){
        System.out.println("");
        Node current = head;
        while(current.next!=null){

            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println(current.data);
        System.out.println("Head :"+head.data+" Tail :"+tail.data+" Length :"+length);

    }
    
    //Linked List Reverse (CROSSROADS)

    void reverse(){
      Node current = head;
      Node previousNode = null;
      Node nextNode =null;

      while(current != null){
            nextNode = current.next;
            current.next = previousNode;
            previousNode = current;
            current = nextNode;
      }
      head = previousNode;


    }
    public static void main(String args[]){
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.insertStart(100);
        l1.insertStart(200);
        l1.insertStart(300);
        l1.insertStart(400);
        l1.insertStart(500);
        l1.insertStart(600);
        l1.display();
        l1.reverse();
        l1.display();

        l1.reverse();


        l1.display();
    }
}
