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
        }
    }

    // now static
    public static void createGraph(ArrayList<Edge>[] graph) {
    for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<Edge>();
    }
    
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 4));
    
    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 4));
    
    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 3));
    
    graph[3].add(new Edge(3, 2));
    
    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));
    graph[4].add(new Edge(4, 5));
    
    graph[5].add(new Edge(5, 4));
}

    public static boolean isCycleUnDirected(ArrayList<Edge> graph[],boolean [] visited,int current , int parent){
        visited[current]=true;
        
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(visited[e.dest] && parent != e.dest){
                return true;
            
            }
            if(!visited[e.dest] && isCycleUnDirected(graph,visited,e.dest,current)){
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];   
        boolean[] recStack = new boolean[v];
        
        //for disconnected components just like all 
        for(int i=0;i<v;i++){
            if(!visited[i]){
            boolean result = isCycleUnDirected(graph,visited,i,-1);
               if(result){
                System.out.println(result);
                break;
               }
            }
        }
    }
}