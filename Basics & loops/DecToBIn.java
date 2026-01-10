import java.util.*;
public class one{
    public static void Convert(int num){
        int bin=0;
        int original=num;
        int power=0;
        while(num>0){
           int rem=num%2;
            bin=bin+(rem*(int)Math.pow(10,power));
            power++;
            num=num/2;
        }
    System.out.println("the decimal "+original+"in binary : " + bin);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Convert(12);
    }
}