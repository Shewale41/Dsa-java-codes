import java.util.*;

public class ArrayQueue {
    static class Queue {
        int size;
        int rear = -1;
        int front = -1;
        int arr[];

        Queue(int n) {
            size = n;
            arr = new int[n];
        }

        boolean isEmpty() {
            return rear == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void enqueue(int val) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (isEmpty()) {
                rear = front = 0;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = val;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int temp = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return temp;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(0);
        q.dequeue();
        q.dequeue();
        q.enqueue(23);
        q.enqueue(5);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
