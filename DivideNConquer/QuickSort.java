public class Sorting{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QuickSort(int arr[],int si,int ei){
        //BC
        if(si>=ei){
            return;
        }
        int idx=Partition(arr,si,ei);
        QuickSort(arr,si,idx-1);
        QuickSort(arr,idx+1,ei);
    }
    public static int Partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        //iterator
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
            //placing the pivot
            i++;
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
        //returning the pivot
        return i;    
    }
    public static void main(String args[]){
        int array[]={1,4,6,8,3,1,0,-1,-5,7};
        QuickSort(array,0,array.length-1);
        PrintArray(array);
    }
}