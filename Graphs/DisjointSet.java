import java.util.*;

class Solution{

    public static class DisjointSetU{
        int n;
        int rank[],parent[];

        DisjointSetU(int n){
            this.n=n;
                rank = new int[n];
                parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                rank[i]=0;
            }
        }

        public int find(int x){
            if(parent[x]==x){
                return x;
            }
            return parent[x] =.  find(parent[x]);
        }

        public void union(int a , int b){
            int parA= find(a);
            int parB = find(b);

            if(parA==parB) return;

            if(rank[parA]==rank[parB]){
                parent[parB] = parA;
                rank[parA]++;
            }else if(rank[parA]> rank[parB]){
                parent[parB] = parA;
            }else{
                parent[parA] = parB;
            }
        }

        public void getInfo(){
            for(int i=0;i<n;i++){
                System.out.print(parent[i]+" ");
            }
            System.out.println();
            for(int i=0;i<n;i++){
                System.out.print(rank[i]+" ");
            }
        } 
    }

    public static void main(String args[]){
        DisjointSetU dsu=new DisjointSetU(6);
        dsu.union(0,2);
        dsu.find(2);
        dsu.union(1,3);
        dsu.union(2,5);
        dsu.union(0,3);
        dsu.find(2);
        dsu.union(0,4);
        dsu.getInfo();
    }
}