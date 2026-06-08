import java.util.*;

public class Main {
    public static void main(String[] args) {
       SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertEnd(20);
        sll.insertEnd(30);
        sll.insertStart(10);
        sll.insertEnd(40);
        sll.insertAtPosition(50, 5);
        sll.insertEnd(60);
        sll.traversal();
        sll.removeFirst();
        sll.traversal();
        sll.removeFirst();
        sll.traversal();
        
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head = null;
    Node tail = null;
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        // System.out.println(head.data+" "+tail.data);
    }
    void insertStart(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        // System.out.println(head.data+" "+tail.data);
    }
    void traversal(){
        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void insertAtPosition(int data, int pos){
        if(pos == 1){
            insertStart(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Invalid Position");
            // insertEnd(data);
            return;
        }
        if(temp.next == null){
            insertEnd(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
}