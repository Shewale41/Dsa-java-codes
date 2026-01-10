import java.util.*;
public class ReverseOfNum2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=251103;
        int rev=0;
        while(n!=0){
            int nnew=n%10;
            rev=(rev*10)+nnew;
            n=n/10;

        }System.out.print(rev);
    }
}