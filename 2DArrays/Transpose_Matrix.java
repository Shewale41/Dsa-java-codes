import java.util.*;
public class one{
    public static void Pose(int arr[][]){
        int trans[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                    trans[j][i]=arr[i][j];
            }
        }
         for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
         }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,5,11,12},
            {13,14,15,16}
        };
        Pose(arr);
    }
}