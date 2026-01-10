public class Solution{
    public static void CountingSort(int arr[]){
        int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
       }
       //new array
       int frequency[]=new int[max+1];
       //frequecy check
       for (int idx = 0; idx < arr.length; idx++) {
             frequency[arr[idx]]++;   
       }
       //final array
       int i=0;
       for (int idx = 0; idx < frequency.length; idx++) {
           while(frequency[idx]>0){
            arr[i]=idx;
            i++;
            frequency[idx]--;
           }
           
       }
    }
    //find comman elements in three arrays
    public static void CommanAmongThree(int a[],int b[],int c[]){
        
        
        for(int i=0;i<c.length;i++){
            //in a array
            boolean forA=false;
            int idx=0;
            boolean forB=false;
            while(idx<a.length){
                if(a[idx]==c[i]){
                forA=true;
                break;
                }
                idx++;
            }
            //in b array
            int idx2=0;
            while(idx2<b.length){
                if(b[idx2]==c[i]){
                    forB=true;
                    break;
                }
                idx2++;
            }

            if(forA==true && forB==true){
                System.out.print(c[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,1,4,8,4,0,5,1,7,4};
        // CountingSort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int A[] = {1, 5, 10,13, 20, 30};
        int  B[] = {5, 13, 15, 20};
         int C[] = {5, 13,20};
        CommanAmongThree(A, B, C);
    
    }
}