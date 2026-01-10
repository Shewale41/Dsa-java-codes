import java.util.*;
public class one{
    public static void CountingSort(int num[]){
        int largest=Integer.MIN_VALUE;
        //for finding largest value
        for(int i=0;i<num.length;i++){
            largest=Math.max(largest,num[i]);
        }
        //making count array to keep track of frequency
        int count[]=new int[largest+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int  num[]={4,3,2,1,2,1,4,3,5};
     CountingSort(num);
     for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
     }
    }
}