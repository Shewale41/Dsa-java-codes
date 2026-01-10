import java.util.*;
public class one{
    public static void sub(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
           System.out.println(); 
        }
        int total=(num.length)*((num.length)+1)/2;
        System.out.println("total subarrays is:"+total);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={2,4,6,8,10};
        sub(num);
    }
}