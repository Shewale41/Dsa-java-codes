import java.util.*;
public class BinToDec{
    public static int Convert(int num){
        int dec=0;
        int power=0;
        int ld;
        while(num>0){
           ld=num%10;
           dec=dec+(ld * (int)Math.pow(2,power));
           num=num/10;
           power++; 
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print(Convert(101));
    }
}