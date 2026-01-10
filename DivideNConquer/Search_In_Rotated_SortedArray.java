public class Sorting{
    public static int Search2(int nums[],int k){
        int si=0;
        int ei=nums.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]==k){
                return mid;
            }

            //int first half
            if(nums[si]<=nums[mid]){
                if(nums[si]<=k && k<=nums[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }else//2nd half
            {
                if(nums[mid]<=k && k<=nums[ei]){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }
       return -1; 
    }
    public static int Search(int arr[],int tar,int si,int ei){
        //BC
        if(si>ei){
            return -1;
        }
        
        int mid=si+(ei-si)/2;
        
        if(arr[mid]==tar){
            return mid;
        }

        //L1
        if(arr[si]<=arr[mid]){
            //left part
            if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr,tar,si,mid-1);
            }else {//right part
                return Search(arr,tar,mid+1,ei); 
            }
        }//L2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return Search(arr,tar,mid+1,ei);
            }else{
                return Search(arr,tar,si,mid-1);
            }
        }
    }

     public static void main(String args[]){
        int array[]={4,5,6,7,0,3};
        System.out.println(Search(array,3,0,array.length-1));
        System.out.print(Search2(array,3));
     }
}