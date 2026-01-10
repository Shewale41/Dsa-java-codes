class Solution{
    static int ActivitySelection(int arr1[],int arr2[]){
        int count=0;
        int lastCAEndTime=arr2[0];
        count++;
        System.out.print("A0"+" ");
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>=lastCAEndTime){
                System.out.print("A"+i+" ");
                lastCAEndTime=arr1[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,0,5,8,5};
        int arr2[]={2,4,6,7,9,9};
        int total=ActivitySelection(arr1, arr2);
        System.out.println();
        System.out.println("total number of activities -> "+total);
    }
}