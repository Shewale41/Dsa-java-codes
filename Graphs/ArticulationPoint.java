//Print All Paths from source to destination 

import java.util.*;

class Solution {

    static class Edge {
        int src;
        int dest;
        // int wgt;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
            // this.wgt = w;
        }
    }
    

   private static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }

    // undirected edges — add both directions
    addEdge(graph, 0, 2);
    addEdge(graph, 0, 3);
    addEdge(graph, 1, 0);
    addEdge(graph, 2, 1);
    addEdge(graph, 3, 4);
}

// helper to add an undirected edge in both directions
private static void addEdge(ArrayList<Edge> graph[], int u, int v) {
    graph[u].add(new Edge(u, v));
    graph[v].add(new Edge(v, u));
}

    public static void dfs(ArrayList<Edge> graph[],int current ,int par,
     int dt[] , int low[] ,boolean vis[],int time, boolean ap[] ){
        vis[current] = true;
        dt[current]=low[current]=++time;
        int children =0;

        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            int neigh = e.dest;

            if(neigh == par ){
                continue;
            }else if(vis[neigh]){
                low[current] = Math.min(low[current],dt[neigh]);
            }else{
                dfs(graph,neigh,current,dt,low,vis,time,ap);
                low[current] = Math.min(low[current],low[neigh]);
                if(dt[current] <= low[neigh] && par!=-1){
                    ap[current] = true;
                }
                children++;
            }
        }

        if(par == -1 && children > 1){
            ap[current] = true;
        }
    }
   
    public static void AriculationPoint(ArrayList<Edge> graph[],int V){
            int dt[] = new int[V];
            int low[] = new int[V];
            int time =0;
            boolean visited[] = new boolean[V];
            boolean ap[] = new boolean[V];

            for(int i=0;i<V;i++){
                if(!visited[i]){
                    dfs(graph,i,-1,dt,low,visited,time,ap);
                }
            }

            for(int i=0;i<ap.length;i++){
                if(ap[i]){
                System.out.println("AP :" + i);
                }
            }
    }
 
    public static void main(String args[]) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
         
        
        AriculationPoint(graph,v);
        
    }
}    