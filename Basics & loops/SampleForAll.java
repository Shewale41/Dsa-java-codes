import java.util.*;
public class one{
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrintPrime(int n){
       for(int i=2;i<=n;i++){
        if(isPrime(i)==true){
            System.out.println(i);
        }
       } 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PrintPrime(100);
        
    }
}