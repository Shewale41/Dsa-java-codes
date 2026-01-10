public static void swapNode(int x,int y){
    public static int count=1;
    Node curr=head;
    while(curr!=null){
        while(count<x){
            left=curr;
            curr=curr.next;
            count++;
        }
        while(count<y){
            right=curr;
            curr=curr.next;
            count++;
        }
        Node temp=left;
        //y Node swap
        right.next.next=left.next;
        left.next=right.next;
        //x node swap
        right.next=temp;
        temp.next=right.next.next;
    }
}