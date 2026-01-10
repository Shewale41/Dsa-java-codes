import java.util.*;
public class one{
    public static void Palindrome(int num){
        int reverse=0;
        int myNum=num;
        while(num>0){
            int ld=num%10;
            reverse=(reverse*10)+ld;
            num=num/10;
        }
        if(myNum==reverse){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        Palindrome(num);
    }
}