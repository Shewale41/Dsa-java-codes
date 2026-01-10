import java.util.*;
public class String_Anagram{
    public static boolean go(String s,String t){
        if(s.length()==t.length()){
            s=s.toLowerCase();
            t=t.toLowerCase();
            char[] one=s.toCharArray();
            char[] two=t.toCharArray();
            Arrays.sort(one);
            Arrays.sort(two);
            boolean result=Arrays.equals(one,two);
            if(result){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="oney";
        String t="neoy";
        System.out.println(go(s,t));
    }
}