import java.util.*;
public class SelectionSort{
    public static void Sort(int num[]){
        //sorted array from 0 to n-2(2nd last)
        for(int i=0;i<num.length-1;i++){
            int min=i;
            //unsorted from 1 to n-1(last)
            for(int j=i+1;j<num.length;j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
           //swap
           int temp=num[min];
           num[min]=num[i];
           num[i]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int  num[]={5,3,1,4,2};
     Sort(num);
     for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
     }
    }
}