//chocolate distribution
//chess board distribution
//board distribution
import java.util.*;
class Solution{
    static int Chocola(Integer horiVal[],Integer verVal[]){
       Arrays.sort(horiVal, Collections.reverseOrder());
       Arrays.sort(verVal, Collections.reverseOrder());
       int h=0,v=0;
       int hp=1,vp=1;
       int cost=0;
       while(h<horiVal.length && v<verVal.length){
        if(horiVal[h]>=verVal[v]){
            cost+=horiVal[h]*vp;
            h++;
            hp++;
        }else{
            cost+=verVal[v]*hp;
            v++;
            vp++;
        }
       }
       while(h<horiVal.length){
         cost+=horiVal[h]*vp;
         h++;
         hp++;
       }
       while(v<verVal.length){
        cost+=verVal[v]*hp;
        vp++;
        v++;
       }
       return cost;
    }
    public static void main(String[] args) {
        Integer horiVal[]={4,1,2};
        Integer verVal[]={2,1,3,1,4};
        System.out.println("The minimun cost :"+Chocola(horiVal, verVal));
    }
}