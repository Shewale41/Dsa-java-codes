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
    public static int size;
    public static int removeFirst(){
        if(size==0){
            System.out.println(" empty ll");
            return -1111;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

     public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
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
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
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
        System.out.println();
    }
    public static void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        Node newNode =new Node(data);
        size++;
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(10);
        addMiddle(3,57);
        printLL();
        System.out.println(removeFirst());
        System.out.println(removeFirst());
        System.out.println(removeFirst());

        System.out.println("size :"+size);
        printLL();
    }
}