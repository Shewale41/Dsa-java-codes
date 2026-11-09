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
    graph[1].add(new Edge(1, 2, -4));

    // From node 2
    graph[2].add(new Edge(2, 3, 2));

    // From node 3
    graph[3].add(new Edge(3, 4, 4));

    // From node 4 (negative weight edge -> Bellman-Ford use case)
    graph[4].add(new Edge(4, 1, -1));

    // Node 5 does not exist here: V = 5, so graph array size must be 5
}

    public static void bellmanFord(ArrayList<Edge> graph[],int v){
        int dist[] = new int[v];
        for(int i=0;i<v;i++){
            if(i!=0){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<v-1;i++){

            for(int u=0;u<v;u++){

                for(int k=0;k<graph[u].size();k++){
                    Edge e = graph[u].get(k);
                    int neigh = e.dest;
                    int wt = e.wgt;
                    if(dist[u]+wt < dist[neigh]){
                        dist[neigh] = dist[u] + wt;
                    }
                }
            }
        }

        for(int num:dist){
            System.out.print(num + " ");
        }

    }
 
    public static void main(String args[]) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];   
        
        bellmanFord(graph,v);
        
    }
}    