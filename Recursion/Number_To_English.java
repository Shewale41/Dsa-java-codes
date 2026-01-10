public class Recursion{
    //coverts 1947 into one nine four seven
   static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void Convert(int num){
        //BC
        if(num==0){
            return;
        }
        int lastdigit=num%10;
        Convert(num/10);
        System.out.print(arr[lastdigit]+" ");
    }
    public static void main(String args[]){
        int num=19497;
        Convert(num);
    }
}