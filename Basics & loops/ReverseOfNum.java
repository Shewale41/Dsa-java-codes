import java.util.*;
public class ReverseOfNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=251103;
        while(n!=0){
            int nnew;
            nnew=n%10;
            n=n/10;
            System.out.print(nnew);
        }
    }
}