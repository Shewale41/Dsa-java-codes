public class BackTracking{
    public static void changeArr(int arr[],int i,int val){
        //BC
        if(i==arr.length){
            PrintArray(arr);
            return;
        }
        //work
        arr[i]=val;
        //recursion
        changeArr(arr,i+1,val+1);
        //backtracking
        arr[i]=arr[i]-2;
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr,0,1);
        PrintArray(arr);
    }
}