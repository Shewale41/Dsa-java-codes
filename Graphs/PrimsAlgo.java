//Print All Paths from source to destination 

import java.util.*;

class Solution {

    

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair (int n,int c){
            this.node=n;
            this.cost=c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }    
    }

    public static void primsAlgo(ArrayList<Edge> graph[],int v){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[v];  

        pq.add(new Pair(0,0));
        int mstCost = 0;
        while(!pq.isEmpty()){
            Pair current = pq.remove();
            if(!visited[current.node]){
                visited[current.node] = true;
                mstCost+=current.cost;
                for(int i=0;i<graph[current.node].size();i++){
                    Edge e = graph[current.node].get(i);
                    if(!visited[e.dest]){
                        pq.add(new Pair(e.dest,e.wgt));
                    }
                }
            }
        }
        System.out.println("Mst cost -> "+ mstCost);
    }
 
    public static void main(String args[]) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
         
        
        primsAlgo(graph,v);
        
    }
}    