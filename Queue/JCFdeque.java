import java.util.*;
class Solution{
    public static void main(String args[]){
        // Deque<Integer> d=new ArrayDeque<>();
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(2);
        d.addFirst(1);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        System.out.println("first ele  "+d.getFirst());
        System.out.println("last ele  "+d.getLast());
    }
}