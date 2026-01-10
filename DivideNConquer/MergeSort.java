public class Sorting{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        MergeSort(arr,si,mid);
        MergeSort(arr,mid+1,ei);

        Merge(arr,si,mid,ei);
    }
    public static void Merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for remaining left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for reamaining rigth part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copying the temp to original
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int array[]={1,4,6,8,3,1,0,-1};
        MergeSort(array,0,array.length-1);
        PrintArray(array);
    }
}