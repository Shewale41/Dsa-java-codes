import java.util.*;
public class one{
    //allways used in n*n ex.4*4,3*3 matrixs
    public static void Dia1(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void Dia2(int arr[][]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            //primary diagonal
            sum+=arr[i][i];
            //secondary diagonal
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,5,11,12},
            {13,14,15,16}
        };
        Dia1(arr);
        Dia2(arr);
        
    }
}