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

    // From node 0
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    // From node 1
    graph[1].add(new Edge(1, 0));

    graph[1].add(new Edge(2, 1));

    // Node 2 has no outgoing edges

    // From node 3
    graph[3].add(new Edge(3, 4));

    // Nodes 4 has no outgoing edges
}

    public static void TopoSort(ArrayList<Edge> graph[],int current,boolean visited[],Stack<Integer> stack){
        visited[current]=true;

        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(!visited[e.dest]){
                TopoSort(graph,e.dest,visited,stack);
            }
        }
        stack.push(current);
    }

    public static void dfs(ArrayList<Edge> transpose[],int current,boolean visited[]){
        visited[current] = true;
        System.out.print(current+" ");

        for(int i=0;i<transpose[current].size();i++){
            Edge e = transpose[current].get(i);

            if(!visited[e.dest]){
                dfs(transpose,e.dest,visited);
            }
        }
    }
 
    public static void kosaRajusAlgo(ArrayList<Edge> graph[],int v){

        //Step-1 TopoSort (v+e)
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[v];

        for(int i=0;i<v;i++){
            if(!visited[i]){
                TopoSort(graph,i,visited,stack);
            }
        }

        //step-2 Transpose (v+e)
        ArrayList<Edge> transpose[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
              transpose[i] = new ArrayList<>();
              visited[i]=false;
        }

        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                int dest = e.dest;
                int src = e.src;
                transpose[dest].add(new Edge(dest,src));
            }
        }

        //step-3 perform dfs on the stack (v+e)
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(!visited[current]){
            dfs(transpose,current,visited);
            System.out.println(" ");
            }  
        }
    }

 
    public static void main(String args[]) {
        int v = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
         
        
        kosaRajusAlgo(graph,v);
        
    }
}    