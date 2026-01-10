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
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        //if size is 1 or 0
        if(head==null || head.next==null){
            return true;
        }
        //1st step -find mid
        Node mid=findMid(head);

        //2nd step reverse the 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //3rd step - check the left and right half
        Node left=head;
        Node right=prev;//as prev is 1st node right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void deleteNthNodeFromEnd(int n){
        //function to find size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        //if n =sz that is we have to delete first node
        if(n==sz){
            head=head.next;
            return;
        }

        Node prev=head;
        int idx=1;
        int iToFind=sz-n;
        while(idx<iToFind){
            prev=prev.next;
            idx++;
        }
        prev.next=prev.next.next;
        return;
    }
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
        ll.addLast(1);
        ll.addLast(3);
        printLL();
        System.out.println(ll.isPalindrome());
    }
}