import java.util.*;
class Solution{
    static int maxValue(int value[],int weight[],int totalWeight){
    int ratio[]=new int[value.length];
    for(int i=0;i<ratio.length;i++){
        ratio[i]=(value[i])/(weight[i]);
    }
    //2d table 
    int full [][] = new int[value.length][3];
    for(int i=0;i<value.length;i++){
        full[i][0]=ratio[i];
        full[i][1]=value[i];
        full[i][2]=weight[i];
    }
    //sorting on the basis of ratio
    Arrays.sort(full,Comparator.comparingDouble(o->o[0]));
    //calculation part
    int capacity=totalWeight;
    int maxVal=0;
    for(int i=value.length-1;i>=0;i--){
        if(capacity>=full[i][2]){
            capacity-=full[i][2];
            maxVal+=full[i][1];
        }else{
            maxVal=maxVal+capacity*full[i][0];
            break;
        }
    }
    return maxVal;
    }
    public static void main(String args[]){
        int weights[]={10,20,30};
        int value[]={60,100,120};
        int totalWeight=50;
        int res=maxValue(value,weights,totalWeight);
        System.out.println("total value :"+res);
    }
}