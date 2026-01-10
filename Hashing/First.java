import java.util.HashMap;
import java.util.Set;

class Solution{

    public static void main(String args[]){

       HashMap<String,Integer> map = new HashMap<>();

       map.put("India",150);
       map.put("China",100);
       map.put("Pakistan",123);

      //  System.out.println(map.get("India"));
      //  map.remove("China");
      //  System.out.println(map);
      //  System.out.println(map.size());
    //    map.clear();
       System.out.println(map);
       Set<String> keys = map.keySet();
         for(String k : keys){
            System.out.print("key -> "+k+", value-> "+ map.get(k));
         }

    }
}