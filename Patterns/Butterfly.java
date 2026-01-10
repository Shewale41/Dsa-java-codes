import java.util.*;
public class one{
    public static void Convert(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
            }
        for(int i=n;i>=1;i--){
            //2nd half
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();   
        }    
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Convert(4);
    }
        }
    
