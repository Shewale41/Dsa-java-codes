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

        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3, 1,0));
        

        graph[4].add(new Edge(4, 0,10));
        graph[4].add(new Edge(4, 1,10));

        graph[5].add(new Edge(5, 0,10));
        graph[5].add(new Edge(5, 2,10));

        // graph[6].add(new Edge(6, 0 ,0));      
        
    }

    //topological sort here 
    public static void TopoSort(ArrayList<Edge> graph[],boolean visited[],int current , Stack<Integer> stack ){
        visited[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(visited[e.dest]==false)
              TopoSort(graph,visited,e.dest,stack);
        }
        stack.push(current);
    }


    public static void main(String args[]) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];   
        Stack<Integer> stack = new Stack<>();
        
        //for disconnected components just like all 
        for(int i=0;i<v;i++){
            if(!visited[i]){
               TopoSort(graph,visited,i,stack);
               }
            }

        while(!stack.isEmpty()){
            System.out.print("->"+stack.pop());
        }    
        }
        
    }