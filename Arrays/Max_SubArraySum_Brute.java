import java.util.*;
public class one{
    public static void sum(int num[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=num[k];
                }
                System.out.print(currentsum+" ");
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
                System.out.println();
            }
        }

        System.out.println("maxsum is:" + maxsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={1,-2,6,-1,3};
        sum(num);
    }
}