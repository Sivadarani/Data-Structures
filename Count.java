import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Count {

    static int countOccurrence(Node head, int value) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                count++;
            }
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);

        System.out.println(countOccurrence(head, 1));
    }
}