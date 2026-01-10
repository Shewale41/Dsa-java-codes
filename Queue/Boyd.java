public class Boyd {

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
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = val;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int res = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
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
        // Queue q = new Queue(3);
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // System.out.println(q.dequeue());
        // q.enqueue(4);
        // System.out.println(q.dequeue());
        // q.enqueue(5);
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.dequeue();
        // }
        

    }
}
