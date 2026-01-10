public class Solution{
    public static int one(int num){
        int counter=0;
        while(num>0){
            if((num&1)  != 0){
                counter++;
            }
            num=num>>1;
        }
        return counter;
    }
    public static void main(String args[]){
        System.out.println(one(15));
    }
}