import java.util.*;
public class Max_SubArraySum_Kadanes{
    public static void Sum(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currentsum+=num[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        System.out.println("MAXSUM :" + maxsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        Sum(num);
    }
}