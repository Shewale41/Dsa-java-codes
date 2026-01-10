
import java.lang.reflect.Array;

public class Searching{
    //second mehtod but efficient one
    public static int Ceil(int nums[],int low,int high,int k){
        if(k<=low){
            return low;
        }
        int i;
        for(i=low;i<high;i++){
            if(nums[i]==k){
                return k;
            }
            //if k lies in i and i+1
            if(nums[i]<k && nums[i]>=k){
                return i+1;
            }
        }
        return -1;
    }
    public static void Floor_Ceiling(int nums[],int k){
        int floor=Integer.MIN_VALUE;
        int ceiling=Integer.MIN_VALUE;
        //for floor
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<=k){
                floor=nums[i];
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=k){
                ceiling=nums[i];
                break;
            }
        }
        if(floor<0){
            System.out.println("floor doesn't exist");
        }else{
            System.out.println("floor : "+floor);
        }
        
        if(ceiling<0){
            System.out.println("ceiling doesn't exist");
        }else{
            System.out.println("ceiling : "+ceiling);
        }
    }

    public static void main(String args[]){
        int arr[]={1, 2, 8, 10, 10, 12, 19};
        Floor_Ceiling(arr,0);
    }
}