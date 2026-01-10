import java.util.*;
public class one{
    public static void Sort(int num[]){
        for(int i=1;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;
            //rigth position for current element
            while(prev>=0 && num[prev]>curr){
                num[prev+1]=num[prev];
                prev--;
            }
            //insertion
            num[prev+1]=curr; 
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int  num[]={5,2,1,4,3};
     Sort(num);
     for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
     }
    }
}