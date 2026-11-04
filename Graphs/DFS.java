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

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 3,10));
        

        graph[2].add(new Edge(2, 4,2));

        graph[3].add(new Edge(3, 4,0));
        graph[3].add(new Edge(3, 5,-1));

        graph[4].add(new Edge(4, 5,10));

        graph[5].add(new Edge(5, 6,10));

        // graph[6].add(new Edge(6, 0 ,0));
        
    }

    private static void dfs(ArrayList<Edge> graph[],int current,boolean visited[]){       
        System.out.print(current+" ");
        visited[current]=true;
        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);
            if(visited[e.dest]==false)
              dfs(graph,e.dest,visited);
        }
    }

    public static void main(String args[]) {
        int v = 7;
        // @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        // print to verify
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.src + ", " + e.dest + ", weight-> " + e.wgt + ") ");
            }
            System.out.println();
        }
        boolean visited [] = new boolean[v];
        dfs(graph,0,visited);
        
    }
}