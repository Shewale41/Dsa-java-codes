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

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 3,10));
        

        graph[2].add(new Edge(2, 4,2));

        graph[3].add(new Edge(3, 4,0));
        graph[3].add(new Edge(3, 5,-1));

        graph[4].add(new Edge(4, 5,10));
        graph[4].add(new Edge(4, 3, 0));

        graph[5].add(new Edge(5, 6,10));

        // graph[6].add(new Edge(6, 0 ,0));
        
    }

    private static void allPaths(ArrayList<Edge> graph[], boolean visited[], int current, String path, int target) {
    if (current == target) {
        System.out.println(path);
        return;
    }

    for (int i = 0; i < graph[current].size(); i++) {
        Edge e = graph[current].get(i);
        if (!visited[e.dest]) {
            visited[e.dest] = true;                                  // ✅ mark the node we enter
            allPaths(graph, visited, e.dest, path + " -> " + e.dest, target);
            visited[e.dest] = false;                                 // ✅ backtrack properly
        }
    }
}

    public static void main(String args[]) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];
        visited[0] = true;
        allPaths(graph, visited, 0, "0", 5);
        
    }
}