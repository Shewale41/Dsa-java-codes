import java.util.*;
public class DoWhileLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }while(true);
        System.out.println("Oopps you've entered a multiple of 10");
    }
}