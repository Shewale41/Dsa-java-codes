import java.util.ArrayList;
import java.util.Collections;
public class One{
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> nums){
        //from 2nd to 2nd last element 
        //non lonely condition is to have equal elements and adjacent element
        Collections.sort(nums);
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=1;i<nums.size()-1;i++){
            if(nums.get(i-1)+1<nums.get(i) && nums.get(i)+1<nums.get(i+1)){
                list.add(nums.get(i));
            }
        }
        //if size is one
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        //for first element
        if(nums.get(0)+1<nums.get(1)){
            list.add(nums.get(0));
        }
        //for last element
        if(nums.get(nums.size()-2)+1  < nums.get(nums.size()-1)){
            list.add(nums.get(nums.size()-1));
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(5);
        System.out.println(lonelyNumbers(list));
    }

}