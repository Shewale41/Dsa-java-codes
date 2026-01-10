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

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void printLL(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty LL");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(10);
        printLL();
    }
}