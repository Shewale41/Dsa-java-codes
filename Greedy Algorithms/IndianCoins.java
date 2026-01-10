//indian coins -> minimun numbers of notes required to make change for value v
import java.util.*;
class Solution{
    public static void main(String[] args) {
    //if the coins array is not sorted then we have to sort it in descending order    
    //Integer coins can be sorted in descending by Arrays.sort(coins,Comparator.reverseOrder());
    int coins[]={1,2,5,10,20,50,100,500,2000};
    int value=1059;
    //function starts here
    int count=0;
    int current=0;
    int i=coins.length-1;
    ArrayList <Integer> res=new ArrayList<>();
    while(i>=0){
        if(value==current){
            break;
        }
        if(value<coins[i]+current){
            i--;
        }else{
            current=current+coins[i];
            res.add(coins[i]);
            count++;
        }
    }
    for(int j=0;j<res.size();j++){
        System.out.print(res.get(j)+" ");
    }
    System.out.println();
    System.out.println("total no of coins/notes for value :"+value+"->"+count);
    }
}