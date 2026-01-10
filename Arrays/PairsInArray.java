import java.util.*;
public class one{
    public static void Pairs(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={2,4,6,8,10};
        Pairs(num);
    }
}