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
    public static void zigZag(){
        //get mid(the last node of first half)
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        Node mid=slow;
        //reverse the second(right half)
        Node curr=mid.next;
        Node prev=null;
        Node next;
        mid.next=null;//cutting both halves
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //alternate matvhing or zigzag rule
        Node left=head;//left head pointer
        Node right=prev;//right head pointer
        Node nextL;//next node of left(stores temporaryly)
        Node nextR;//next node of right(stores temporarly)
        while(left!=null && right!=null){
            //alternate
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //update
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL();
        ll.zigZag();
        ll.printLL();
    }
}   