import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Solution{
    public static  void main(String args[]){
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",150);
        tm.put("China",200);
        tm.put("Nepal",25);
        tm.put("Argentina",33);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",150);
        hm.put("China",200);
        hm.put("Nepal",25);

        System.out.println(hm);
        System.out.println(tm);
    }
}