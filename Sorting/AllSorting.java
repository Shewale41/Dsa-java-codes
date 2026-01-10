

public class AllSorting{
    public static void BubbleSort(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            count++;
        }
        System.out.println("total iterations :"+count);
    }
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }  
    }
    public static void InsertionSort(int arr[]){
       for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
       }
    }
    public static void CountingSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        //counting array
        int count[]=new int[max+1];
        //filling counting array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //final array changes
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j++]=i;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
         int arr[] = {8,-1,2,-5,-7,9,3,9};
         int arr2[]={4,2,9,0,1,4,2,3,4,5,2,0};
        //  BubbleSort(arr);
        //  SelectionSort(arr);
        //  InsertionSort(arr);
           CountingSort(arr2);
          for(int i=0;i<arr2.length;i++){
          System.out.print(arr2[i]+" ");
         }
    }
}