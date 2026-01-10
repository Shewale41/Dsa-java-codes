import java.util.*;
public class Continue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter your number :");
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("you entered ->"+num);
        }while(true);
    }
}