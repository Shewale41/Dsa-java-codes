public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty LL");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Add a newline for better readability
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    private Node getMid(Node head) {
        if (head == null || head.next == null) return head; // Handle empty or single node case
        Node slow = head;
        Node fast = head.next; // Start fast one step ahead for easier mid-point calculation
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Return the middle node
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1); // Dummy node
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1; // Attach head1
                head1 = head1.next; // Move head1 forward
            } else {
                temp.next = head2; // Attach head2
                head2 = head2.next; // Move head2 forward
            }
            temp = temp.next; // Move temp forward
        }

        // Attach any remaining nodes
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return mergeLL.next; // Return the merged list (skipping dummy node)
    }

    public Node mergeSort(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Get mid
        Node mid = getMid(head);
        Node rightHalf = mid.next; // Get right half
        mid.next = null; // Split the list into two halves

        // Recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHalf);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(5);
        
        System.out.print("Original Linked List: ");
        ll.printLL();

        ll.head = ll.mergeSort(ll.head);
        System.out.print("Sorted Linked List: ");
        ll.printLL();
    }
}
