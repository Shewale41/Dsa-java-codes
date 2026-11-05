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

        graph[0].add(new Edge(0, 2,2));
        
        graph[1].add(new Edge(1, 0,10));
        

        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3, 0,0));        
        
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean [] visited,int current ,boolean [] recStack){
        visited[current]=true;
        recStack[current]=true;

        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);

            if(recStack[e.dest]){return true;}
            else if(!visited[e.dest]){
                if(isCycleDirected(graph,visited,e.dest,recStack)){
                    return true;
                }
            }
        }

        recStack[current]=true;
        return false;
    }


    public static void main(String args[]) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];   
        boolean result = isCycleDirected(graph,visited,0,new boolean[v]);
        System.out.println(result);
    }
}