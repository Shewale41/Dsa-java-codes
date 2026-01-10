import java.util.*;

class Solution{
    static int minCost(int arr[],int n){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:arr){
            p.add(i);
        }
        int res=0;
        while(p.size()>1){
            int first=p.poll();
            int second=p.poll();
            res+=first+second;
            p.add(first+second);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        System.out.println(minCost(arr, arr.length));
    }
}