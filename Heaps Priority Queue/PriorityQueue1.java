import java.util.PriorityQueue;
import  java.util.*;

class Solution{
    public static void main(String args[]){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(6);
        pq.add(4);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}