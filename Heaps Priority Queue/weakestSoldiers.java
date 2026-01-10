import java.util.*;

class Solution{
    static class Rows implements Comparable<Rows>{
        int soldierCount;
        int index;

        Rows(int soldierCount,int index){
            this.soldierCount=soldierCount;
            this.index=index;
        }
        public int compareTo(Rows r2){
            if(this.soldierCount == r2.soldierCount){
                return this.index - r2.index;
            }else{
                return this.soldierCount - r2.soldierCount;
            }
        }
    }
    public static void main(String args[]){

        int arr[][] ={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int k=2;
        // 0's are soldiers and 1's are civilians
        PriorityQueue<Rows> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[0].length;j++){
                count+= arr[i][j] == 1 ?1 : 0;
            }
            pq.add(new Rows(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("Row"+pq.remove().index);
        }
    }
}