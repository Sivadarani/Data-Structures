class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head = null;
    Node tail = null;

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    void traversal() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 1. Find Method
    boolean find(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // 2. Count Occurrence
    int countOccurrence(int value) {
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

    // 3. Find Length
    int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // 4. Find Middle Value
    int findMiddle() {
        if (head == null) {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // 5. Update Value
    void updateValue(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value not found");
    }

    // 6. Update Value Based on Position
    void updateAtPosition(int pos, int newValue) {
        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.data = newValue;
    }
}

public class Singlyll {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertEnd(1);
        sll.insertEnd(2);
        sll.insertEnd(3);
        sll.insertEnd(4);
        sll.insertEnd(1);
        sll.insertEnd(1);
        sll.insertEnd(2);

        System.out.println("Linked List:");
        sll.traversal();

        System.out.println("Find 3: " + sll.find(3));

        System.out.println("Occurrence of 1: "
                + sll.countOccurrence(1));

        System.out.println("Length: "
                + sll.length());

        System.out.println("Middle Value: "
                + sll.findMiddle());

        sll.updateValue(4, 40);
        System.out.println("After updating 4 to 40:");
        sll.traversal();

        sll.updateAtPosition(3, 99);
        System.out.println("After updating position 3:");
        sll.traversal();
    }
}