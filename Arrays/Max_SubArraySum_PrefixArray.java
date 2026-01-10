import java.util.*;
public class one{
    public static void Sum(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
           prefix[i]= prefix[i-1] + num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currentsum=0;
                currentsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
            }
        
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={1,-2,6,-1,3};
        Sum(num);
        
    }
}