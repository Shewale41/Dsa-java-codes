import java.util.*;
public class one{
    public static void Water(int height[]){
        int n=height.length;
        //leftmax array(auxillary)
        int leftmax[]=new int [n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
         leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //rightmax array (auxillary)
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //waterlevel
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trappedWater
            trappedWater+=waterlevel-height[i];
        }
        System.out.println("TrappedWater:" +trappedWater);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={4,2,0,6,3,2,5};
        Water(num);
    }
}