import java.util.*;
public class one{
    public static int Small(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={4,23,8,2,12,5};
        System.out.println(Small(num));
}}