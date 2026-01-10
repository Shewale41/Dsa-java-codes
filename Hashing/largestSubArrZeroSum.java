import java.util.*;

public class Solution{
    public static int maxLenSub(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int len=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+= arr[j];
            if(map.containsKey(sum)){
                len=Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        return len;

    }
    public static void main(String args[]){
        int arr[] ={15,2,-2,7,1,-8,10,23};
        System.out.println("length of largest subarray with sum zero => "+maxLenSub(arr));
    }
}