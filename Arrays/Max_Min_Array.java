import java.util.*;
public class one{
    public static void Cena(int num[]){
         int maxnum=Integer.MIN_VALUE;
         int minnum=Integer.MAX_VALUE;
         for(int i=0;i<num.length;i++){
            if(maxnum<num[i]){
                maxnum=num[i];
            }
            if(minnum>num[i]){
                minnum=num[i];
            }
         }
         System.out.println("MAX :"+maxnum+"MIN :"+minnum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={3,5,4,1,9};
        Cena(num);
    }
}