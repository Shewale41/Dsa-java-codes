
class Solution{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        boolean isEmpty(){
            return head==null && tail==null;
        }
        void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int temp=head.data;
            if(head.next==null){
                head=tail=null;
            }else{
                head=head.next;
            }
            return temp;
        }
    }
   public static void main(String args[]){
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    Node temp=q.head;
    while(temp!=null){
        System.out.println(q.remove());
        temp=temp.next;
    }
    q.remove();
   } 
}