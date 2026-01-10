import java.util.*;
public class one{
    public static void Bothmax(int num[]){
       int ltemp=Integer.MIN_VALUE, rtemp=Integer.MIN_VALUE;
       int leftmax[]=new int[num.length];
       int rightmax[]=new int[num.length];
    int min=0;
    int wt;
    int totalwt=0;
       for(int i=0;i<num.length;i++){
        ltemp=0;
        //for left part
        for(int j=i;j>=0;j--){
            if(ltemp<num[j]){
                ltemp=num[j];
            }
        }
        leftmax[i]=ltemp;
        rtemp=0;
        //for right max part
        for(int j=i;j<num.length;j++){
            if(rtemp<num[j]){
                rtemp=num[j];
            }
        }
        rightmax[i]=rtemp;
       
        
       }
        wt=0;
        //calculate min and get water of that bar
        for(int j=0;j<num.length;j++){
            if(rightmax[j]<leftmax[j]){
                min=rightmax[j];
            }else{
                min=leftmax[j];
            }
            System.out.print("MINIMUM IS :"+min+"  ");
            wt=min-num[j];
            if(wt<0){
                wt=0;
            }
            totalwt+=wt;
        }
       System.out.println("The total water stored is :"+totalwt);
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={4,2,0,6,3,2,5};
        Bothmax(num);
    }
}