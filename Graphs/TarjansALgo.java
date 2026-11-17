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

   

    public static void dfs(ArrayList<Edge> graph[],int current,boolean visited[],int dt[],int low[],int time,int parent){
        visited[current] = true;
        dt[current]=low[current]=++time;

        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(e.dest == parent) {
                continue;
            }else if(!visited[e.dest]){
                dfs(graph,e.dest,visited,dt,low,time,current);
                low[current]=Math.min(low[current],low[e.dest]);
                if(dt[current]<low[e.dest]){  //found the bridge print it 
                    System.out.println("Bridge is : "+ current + "-------" + e.dest);
                }
            }else{
                low[current]=Math.min(low[current],dt[e.dest]);
            }
        }
    }

    public static void getBridge(ArrayList<Edge> graph [],int V){
        int dt[] = new int [V];
        int low[] = new int [V];
        int time = 0;
        boolean vis[] = new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,vis,dt,low,time,-1);
            }
        }
    }

 
    public static void main(String args[]) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
         
        
        getBridge(graph,v);
        
    }
}    