import java.util.*;
public class one{
    public static int Bin(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid;
            mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[]={2,8,23,44,50,90};
        int key=50;
        System.out.println(Bin(numbers,key));
    }
}