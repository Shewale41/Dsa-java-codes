public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //2nd step next = head
        newNode.next=head;
        //3rd step head=newNode
        head=newNode;

    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}