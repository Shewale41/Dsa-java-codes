import java.util.*;

class Solution{
    public static void main(String args[]){

        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //union

        for(int arr:arr1){
            set.add(arr);
        }
        for(int arr:arr2){
            set.add(arr);
        }
        System.out.println("Union elements" + set);
        System.out.println("Union size =" + set.size());

        set.clear();

        //intersection 
        for(int arr:arr1){
            set.add(arr);
        }
        
        int count=0;
        System.out.print("Intersection elemenst ");
        for(int arr:arr2){
            if(set.contains(arr)){
                count++;
                System.out.print(arr + " ");
                set.remove(arr);
            }
        }
        System.out.println("Intersection size "+count);
    }
}