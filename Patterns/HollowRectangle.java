import java.util.*;
public class one{
     public static void Pattern(int TotRow,int TotCol){
            //i=row,j=column
            //using them to traverse the matrix
            for(int i=1;i<=TotRow;i++){
                for(int j=1;j<=TotCol;j++){
                    if(i==1||i==TotRow||j==1||j==TotCol){
                System.out.print("*");
                    }else
                    {
                        System.out.print(" ");
                         }
                }
                         System.out.println();

            }
     }
    public static void main(String args[]){
       
        
        Scanner sc=new Scanner(System.in);
        Pattern(7,10);
    }
}