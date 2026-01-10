public class DoublyLinkedList{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void printLL(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty LL");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public static int removeFirst(){
        if(head==null){
            System.out.println("Empty Dll");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printLL();
        System.out.println(dll.size); 
        dll.removeFirst();
        dll.printLL();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.printLL();
        System.out.println(dll.size);

    }
}