import java.util.*;
public class TaxCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income");
        int income=sc.nextInt();
        int tax;
        if(income<=500000){
            tax=0;
        } else if(income>500000 && income<1000000){
           tax=(int)(income*0.20);
        }else{
            tax=(int)(income*0.30);
        }
           System.out.println("TAX: " + tax);

    }
}