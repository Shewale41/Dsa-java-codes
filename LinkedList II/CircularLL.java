public class CircularLL {
    static class Node {
        int data;
        Node next;
    }

    public static Node last;

    public static Node addEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        System.out.println("addEmpty: " + last.data);
        return last;
    }

    public static Node addFirst(int data) {
        if (last == null) {
            last = addEmpty(last, data);
            System.out.println("addFirst (empty list): " + last.data);
            return last;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        System.out.println("addFirst: " + last.data);
        return last;
    }

    public static void printLL() {
        if (last == null) {
            System.out.println("Empty LL");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("Back to start");
    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.printLL();
    }
}
