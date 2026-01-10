import java.util.*;

class Solution{
    public static void main(String args[]){
        int arr[]={5,4,3,2,1,7,1,2,6,3,4};

        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}