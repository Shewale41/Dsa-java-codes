import java.util.*;
public class tD_Array{
    public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    public static void Compare(int arr[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            min=Math.min(min,arr[i][j]);
            max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println("MIN :"+min+" MAX :"+max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        search(arr,7);
        Compare(arr);
    }
}