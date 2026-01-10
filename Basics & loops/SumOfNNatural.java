import java.util.*;
public class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("SUM: "+sum);
    }
}