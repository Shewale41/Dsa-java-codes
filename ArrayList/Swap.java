import java.util.ArrayList;
import java.util.Collections;
public class One{
   public static void swap(ArrayList<Integer> list,int idx1,int idx2){
      int temp=list.get(idx1);
      list.set(idx1,list.get(idx2));
      list.set(idx2,temp);
   }
   public static void main(String args[]){
    ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(78);
        list.add(9);
        list.add(34);
        list.add(23);
        System.out.println(list);
        swap(list,1,3);
        System.out.println(list);
        //sort in ascending order
        Collections.sort(list);
        System.out.println(list);
        //sort in descending order
        Collections.sort(list,Collections.reverseOrder());//reverseOrder is a comparator - defines function logic
        System.out.println(list); 
   }
}