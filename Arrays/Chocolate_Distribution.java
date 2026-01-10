import java.util.*;

public class Cena{
    public static void Doo(int arr[],int m){
        Arrays.sort(arr);
        int maxdif=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int limit=m+i-1;
            if(limit>=arr.length){
                break;
            }
            int dif=arr[limit]-arr[i];
            maxdif=Math.min(dif,maxdif);
        }
        System.out.print(maxdif);
    }
    public static void main(String args[]){
     int arr[]= {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
     Doo(arr,7);
    }
}