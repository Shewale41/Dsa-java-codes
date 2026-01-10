import java.util.*;
public class LinearSearch{
    public static int Search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
              return i;}
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[]={12,99,48,72,41,32};
        int temp=Search(numbers,72);
        if(temp==-1){
         System.out.println("NOT FOUND");}
        else{
         System.out.println(" FOUND at index :"+ (temp+1)); 
    }}
}