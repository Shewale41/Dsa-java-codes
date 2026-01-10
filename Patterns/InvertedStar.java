import java.util.*;
public class InvertedStar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int line=10;line>=1;line--){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}