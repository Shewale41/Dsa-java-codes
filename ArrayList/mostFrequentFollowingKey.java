import java.util.ArrayList;
public class One{
    public static int mostFrequent(ArrayList<Integer> list,int key){
        int res[]=new int[1000];
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==key){
                res[list.get(i+1)]++;
            }   
        }
         int max=Integer.MIN_VALUE;
         int ans=0;
        for(int i=0;i<res.length;i++){
           if(res[i]>max){
            max=res[i];
            ans=i;
           }
        }
    return ans;
    }
    public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<>();
         nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int key = 2;
        System.out.println(mostFrequent(nums, key));
    }
}