import java.util.*;
public class one{
    public static boolean Cena(int arr[][],int key){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==key){
                System.out.println("found at :("+i+","+j+")");
                return true;
            }else if(key>arr[i][j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("NOT FOUND !!!! ");
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int key=155;
        Cena(arr,key);
    }
}