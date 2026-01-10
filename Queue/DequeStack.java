//stack using deque
import java.util.*;
class DequeStack{
    static class Stack{
        Deque<Integer> d=new LinkedList<>();
        void push(int data){
            d.addFirst(data);
        }
        int pop(){
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
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}