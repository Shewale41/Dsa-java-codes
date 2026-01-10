public class Solution{
    //function returns value at ith position whether it's 0 or 1;
    public static int GetIth(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    //function to set ith position bit to 1(if it's 0 or already 1);{0->1}
    public static int SetIth(int n,int i){
        int bitmask=1<<i;
        n=n|bitmask;
        return n;
    }
    //function to clear ith position 1 bit value to 0(if already 0 then keep 0);{1->0}
    public static int ClearIth(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    //update the value : set the ith pos to 0 0r 1 (NewBit=0 or 1);
    public static int Update(int n,int i,int NewBit){
        n=ClearIth(n, i);
        int bitmask=NewBit<<i;
        return n|bitmask;
    }
    //clear last i bits (example i=2 1111->1100);
    public static int ClearLast(int n,int i){
        int bitmask=~(0)<<i;
        return n&bitmask;
    }
    //clear range of bits (ex:2-7);
    public static int ClearRange(int n,int i,int j){
        int bitmask=(~0)<<(j-i);
        bitmask=~((~bitmask)<<(i+1));
        return n&bitmask;
    }
    //if a number is power of two or not
    public static boolean isPower(int num){
        return (num&(num-1))==0;
    }
        public static void main(String args[]){
    //  System.out.println(GetIth(10,3));   
   // System.out.println(SetIth(10,2));
    //   System.out.println(ClearIth(10,1));
    // System.out.println(Update(10, 1, 0));
    // System.out.println(ClearLast(15, 2));
    // System.out.println(ClearRange(10, 2, 4));
      System.out.println(isPower(8));
    }
}