import java.util.Stack;
public class StackB{
    static String reverseStr(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder str2=new StringBuilder("");
        while(!s.isEmpty()){
            str2.append(s.pop());
        }
        //also use str=str2.toString();
        return str2.toString();
    }
    public static void main(String args[]){
        String str="hello mello";
        System.out.print(reverseStr(str));
    }
}