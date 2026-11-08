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
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));

    // From node 1
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 7));

    // From node 2
    graph[2].add(new Edge(2, 4, 3));

    // From node 3
    graph[3].add(new Edge(3, 5, 1));

    // From node 4
    graph[4].add(new Edge(4, 3, 2));
    graph[4].add(new Edge(4, 5, 5));

    // Node 5 has no outgoing edges
}

  public static class Pair implements Comparable<Pair> {
    int node ;
    int dist ;

    public Pair(int n,int d){
        this.node=n;
        this.dist=d;
    }

    @Override
    public int compareTo(Pair p2){
        return this.dist - p2.dist;
    }
  }

  public static void dijkstra(ArrayList<Edge> graph[],int src , int V , boolean visited[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair current = pq.remove();
            if(!visited[current.node]){
                visited[current.node]=true;

                for(int i=0;i<graph[current.node].size();i++){
                    Edge e = graph[current.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wgt;

                    //relaxation
                    if( dist[u] + wt < dist[v] ){
                        dist[v] = dist[u] + wt ;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
  }




    public static void main(String args[]) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];   
        
        dijkstra(graph,0,v,visited);
        
    }
}    