import java.util.*;
public class BuyNSellStocks{
    public static int Stocks(int num[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<num.length;i++){
            if(buyprice<num[i]){
                int profit=num[i]-buyprice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyprice=num[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]={7,1,5,3,6,4};
        System.out.println(Stocks(num));
    }
}