class Solution {
    public void Next_Permutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            reverse(nums,0);
        }else{
            //breaking point 2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[ind1]<nums[i]){
                    ind2=i;
                    break;
                }
            }
            swap(nums,ind1,ind2);
            //reverse the rigth half
            reverse(nums,ind1+1);
        }
           
    }
    public static void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        public static void reverse(int[] nums,int start){
             int i=start;
             int j=nums.length-1;
             while(i<j){
                swap(nums,i,j);
                i++;
                j--;
             }
        }     

}