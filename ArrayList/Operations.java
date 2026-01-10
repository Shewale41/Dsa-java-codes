import java.util.ArrayList;
public class Operations{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //add
        list.add(5);
        list.add(78);
        list.add(9);
        list.add(34);
        list.add(23);
         //printing in reverse order
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);
        //add at that index
        list.add(3,44);
        System.out.println(list);
        //get element at that index
        System.out.println(list.get(4));
        //remove element at that index 
        list.remove(2);
        System.out.println(list);
        //if list contains the element or not
        System.out.println(list.contains(44));
        System.out.println(list.contains(33));
        //size of list
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
       System.out.println();
       //to find largest element in ArrayList
       int max=Integer.MIN_VALUE;
       for(int i=0;i<list.size()-1;i++){
        max=Math.max(max,list.get(i));
       }
       System.out.println("greatest element :"+max);
    }
}