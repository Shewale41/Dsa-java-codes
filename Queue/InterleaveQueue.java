//interleave two queues 
import java.util.*;
class Solution{
    static void interleave(Queue<Integer> Q){
        Queue <Integer> first=new LinkedList<>();
        int size=Q.size();
        //copy first half in queue
        for(int i=0;i<size/2;i++){
            first.add(Q.remove());
        }
        while(!first.isEmpty()){
            Q.add(first.remove());
            Q.add(Q.remove());
        }

    }
    static void printQ(Queue<Integer> Q){
        int size=Q.size();
        for(int i=0;i<size;i++){
            System.out.print(Q.peek()+" ");
            Q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> Q1=new LinkedList<>();
        Q1.add(1);
        Q1.add(2);
        Q1.add(3);
        Q1.add(4);
        Q1.add(5);
        Q1.add(6);
        Q1.add(7);
        Q1.add(8);
        Q1.add(9);
        Q1.add(10);
        interleave(Q1);
        printQ(Q1);
        // while(!Q1.isEmpty()){
        //     System.out.print(Q1.peek()+" ");
        //     Q1.remove();
        // }
        
    }
}