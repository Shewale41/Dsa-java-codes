import java.util.Stack;

public class ValidParenthesis{
    static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //the opening brace cases
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                //closing brace cases
                //if without any opening brace closing brace found ")))"
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')||
                (s.peek()=='{' && ch=='}') || 
                (s.peek()=='[' && ch==']')){
                    s.pop();
                }
                
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;//if there's something remaining in stack even after operation "((" extra opening
        }
    }        
    public static void main(String args[]){
        String str="((()[]{})";
        System.out.println(isValid(str));
    }
}