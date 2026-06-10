class Queue {
    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int data) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        arr[++rear] = data;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        front++;
    }

    int peek() {
        if (front > rear) {
            return -1;
        }

        return arr[front];
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class queue1 {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();

        System.out.println(q.peek());
    }
}