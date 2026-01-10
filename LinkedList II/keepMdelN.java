public class LinkedList {
    public class Node {
        int data;
        Node next;
    }

    public Node head;

    public void keepMdelN(int m, int n) {
        Node temp = head;
        Node sc = null;
        
        while (temp != null) {
            // Skip M nodes
            for (int mcount = 1; mcount <= m && temp != null; mcount++) {
                sc = temp;
                temp = temp.next;
            }
            // Now delete N nodes
            for (int ncount = 1; ncount <= n && temp != null; ncount++) {
                temp = temp.next;
            }
            // Link the last kept node with the next node after deletion
            if (sc != null) {
                sc.next = temp;
            }
        }
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = ll.new Node();
        ll.head.data = 1;
        Node second = ll.new Node();
        second.data = 2;
        Node third = ll.new Node();
        third.data = 3;
        Node fourth = ll.new Node();
        fourth.data = 4;
        Node fifth = ll.new Node();
        fifth.data = 5;

        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("Original list:");
        ll.printLL();

        ll.keepMdelN(3, 2);

        System.out.println("Modified list:");
        ll.printLL();
    }
}
