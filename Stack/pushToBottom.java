import java.util.Stack;
public class StackB{
    static void pushB(Stack <Integer> s,int data){
        //Base case
        if(s.isEmpty()){ 
            s.push(data);
            return;
        }
        int top=s.pop();
        pushB(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushB(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());        
        }
    }
}