import java.util.*;
public class one{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fruits[]={"apple","mango","java","banana","xolo"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}