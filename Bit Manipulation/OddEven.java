public class Lolution{
    public static void OddEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String args[]){
     OddEven(10);
    OddEven(13);
    OddEven(0);
    OddEven(34);
    }
}