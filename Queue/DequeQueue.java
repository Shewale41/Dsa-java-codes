import java.util.*;
class DequeQueue{
    static class Queue{
        Deque<Integer> d=new ArrayDeque<>();
        void add(int data){
            d.addLast(data);
        }
        int remove(){
            return d.removeFirst();
        }
        int peek(){
            return d.getFirst();
        }
        boolean isEmpty(){
            return d.isEmpty();
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek-> "+q.peek());
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}