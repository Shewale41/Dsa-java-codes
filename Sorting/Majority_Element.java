
import java.util.Arrays;

public class Sorting{
   public static void findMajority(int arr[],int n){
    int count;
    int maxcount=0;
    int index=-1;
    for (int i = 0; i < n; i++) {
        count =0;
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
       if(count>maxcount){
        maxcount=count;
        index=i;
       }
    }
    if(maxcount>n/2){
        System.out.print(arr[index]);
    }else{
        System.out.println("no majority element found");
    }
   }
    public static void main(String args[]){
        int arr[] = {3, 9, 2, 9, 2, 9, 9};
        findMajority(arr, arr.length);
    }
}