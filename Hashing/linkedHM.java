import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution{
    public static  void main(String args[]){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",150);
        lhm.put("China",200);
        lhm.put("Nepal",25);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",150);
        hm.put("China",200);
        hm.put("Nepal",25);

        System.out.println(hm);
        System.out.println(lhm);
    }
}