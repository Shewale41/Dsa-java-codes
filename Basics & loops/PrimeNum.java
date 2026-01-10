import java.util.*;
public class PrimeNUM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num==2){
            System.out.println("PRIME");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}