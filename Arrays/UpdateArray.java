import java.util.*;
public class one{
    public static void Array(int array[]){
        for(int i=0;i<array.length;i++){
            array[i]=array[i]+1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]={4,10,6};
        Array(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}