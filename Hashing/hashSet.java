import java.util.HashSet;
import java.util.*;

class Solution{
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        set.add("melbourne");
        set.add("Brisbane");
        set.add("Sydney");
        set.add("Adelade");
        
        // Iterator itr = set.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        for(String s:set){
            System.out.println(s);
        }
    
        }
}