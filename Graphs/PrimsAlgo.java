//Print All Paths from source to destination 

import java.util.*;

class Solution {

    static class Edge {
        int src;
        int dest;
        int wgt;

        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.wgt = w;
        }
    }
    

    // now static
   private static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }

    // From node 0
    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 15));
    graph[0].add(new Edge(0, 3, 30));

    // From node 1
    graph[1].add(new Edge(1, 0, 10));
    graph[1].add(new Edge(1, 3, 40));

    // From node 2
    graph[2].add(new Edge(2, 0, 15));
    graph[2].add(new Edge(2, 3, 50));

    // From node 3
    graph[3].add(new Edge(3, 0, 30));
    graph[3].add(new Edge(3, 1, 40));
    graph[3].add(new Edge(3, 2, 50));
}

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