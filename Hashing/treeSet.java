import java.util.*;

class Solution{
    public static void main(String args[]){
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("melbourne");
        cities.add("Brisbane");
        cities.add("Sydney");
        cities.add("Adelade");

        HashSet<String> set = new HashSet<>();
        set.add("melbourne");
        set.add("Brisbane");
        set.add("Sydney");
        set.add("Adelade");

        //here's tree set
        TreeSet<String> ts = new TreeSet<>();
        ts.add("melbourne");
        ts.add("Brisbane");
        ts.add("Sydney");
        ts.add("Adelade");

        System.out.println(set);
        System.out.println(cities);
        System.out.println(ts);
    }
}