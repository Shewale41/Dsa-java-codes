import java.util.*;
public class one{
    public static void Reverse(int num[]){
        int first=0 ;
        int last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[]={2,5,87,12,88};
        Reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}