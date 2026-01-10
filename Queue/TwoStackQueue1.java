//remove and peek O(n)
//add O(1)

import java.util.*;

class TwoStackQueue1{
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int data){
            s1.push(data);
        }

        void remove(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int peek(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
            int temp=s2.peek();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return temp;
        }   

    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

            }
}