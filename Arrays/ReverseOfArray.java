import java.util.*;
public class one{
    public static void Revv(int num[]){
        int rev[]=new int[num.length];
        for(int i=0;i<num.length;i++){
            rev[i]=num[num.length-i-1];
        }
        for(int i=0;i<num.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={7,8,17,18,333};
        Revv(num);
    }
}