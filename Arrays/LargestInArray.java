import java.util.*;
public class one{
    public static int LargestInArray(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={6,2,50,8,9,10};
        System.out.println("largest in array is "+LargestInArray(num));
    }
}