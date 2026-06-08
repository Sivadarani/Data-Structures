import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class update
 {

    static void updateValue(Node head, int oldVal, int newVal) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == oldVal) {
                temp.data = newVal;
                break;
            }
            temp = temp.next;
        }
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        updateValue(head, 20, 99);

        display(head);
    }
}