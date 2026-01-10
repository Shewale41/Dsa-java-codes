public class Searching{
    public static void Floor_Ceiling(int nums[],int k){
        int floor=null;
        int ceiling=null;
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
        if(floor==null){
            System.out.println("floor doesn't exist");
        }else{
            System.out.println("floor : "+floor);
        }
        
        if(ceiling==null){
            System.out.println("ceiling doesn't exist");
        }else{
            System.out.println("ceiling : "+ceiling);
        }
    }

    public static void main(String args[]){
        int arr[]={1, 2, 8, 10, 10, 12, 19};
        Floor_Ceiling(arr,1);
    }
}