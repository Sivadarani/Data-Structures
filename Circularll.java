class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Delete a node
    void delete(int key) {
        if (head == null) {
            return;
        }

        // If head node is to be deleted
        if (head.data == key) {
            if (head.next == head) {
                head = null;
                return;
            }

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        do {
            prev = current;
            current = current.next;

            if (current.data == key) {
                prev.next = current.next;
                return;
            }
        } while (current != head);
    }

    // Search a node
    boolean search(int key) {
        if (head == null) {
            return false;
        }

        Node temp = head;

        do {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);

        return false;
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}

public class Circularll {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtBeginning(5);

        System.out.println("Circular Linked List:");
        cll.display();

        System.out.println("Search 20: " + cll.search(20));
        System.out.println("Search 50: " + cll.search(50));

        cll.delete(20);

        System.out.println("After deleting 20:");
        cll.display();
    }
}