import java.util.*;
class Solution{
    static void reverseQ(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qq=new ArrayDeque<>();
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        reverseQ(qq);
        while(!qq.isEmpty()){
            System.out.print(qq.peek()+" ");
            qq.remove();
        }
    }
}