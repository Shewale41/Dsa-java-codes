import java.util.*;
public class BubbleSort{
    public static void Sort(int num[]){
    for(int i=0;i<=num.length-2;i++){
        int swap=0;
        for(int j=0;j<=num.length-2-i;j++){
            if(num[j]>num[j+1]){
            int temp=num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
            swap++;
                        }
        }
        if(swap==0){
            System.out.println("Array is already sorted");
            break;
        }
    }
    }
    public static void main(String args[]){
     int num[]={1,2,3,4,5};
     Sort(num);
     for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
     }
    }
}