import java.util.*;

class Solution {

    static class Edge {
        int src, dest, wgt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wgt = w;
        }
    }

    private static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // ===================== DISJOINT SET (FIXED) =====================
    public static class DisjointSetU {
        int v;
        int[] rank, parent;   // <-- cleaner declaration

        DisjointSetU(int v) {
            this.v = v;
            rank = new int[v];
            parent = new int[v];
            for (int i = 0; i < v; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        // FIX: removed `static` — these methods use instance fields
        public int find(int x) {
            if (parent[x] == x) return x;
            return parent[x] = find(parent[x]);   // path compression
        }

        public void union(int a, int b) {
            int parA = find(a);
            int parB = find(b);

            if (parA == parB) return;

            if (rank[parA] == rank[parB]) {
                parent[parB] = parA;
                rank[parA]++;
            } else if (rank[parA] > rank[parB]) {
                parent[parB] = parA;
            } else {
                parent[parA] = parB;
            }
        }
    }

    // ===================== PAIR FOR PQ (FIXED) =====================
    // Kruskal's needs BOTH endpoints + weight, not just node+cost
    public static class Pair implements Comparable<Pair> {
        int u, v, w;

        Pair(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Pair other) {
            return this.w - other.w;   // min-heap by weight
        }
    }

    // ===================== KRUSKAL'S MST =====================
    public static int kruskalMST(ArrayList<Edge>[] graph, int V) {
        // 1. Flatten adjacency list into edge list
        ArrayList<Edge> edges = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                edges.add(e);
            }
        }

        // 2. Push every edge into the PQ as a Pair
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (Edge e : edges) {
            pq.add(new Pair(e.src, e.dest, e.wgt));   // <-- ADD PAIRS HERE
        }

        // 3. Greedily pick smallest safe edge
        DisjointSetU dsu = new DisjointSetU(V);
        int mstCost = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty() && edgesUsed < V - 1) {
            Pair p = pq.remove();          // smallest weight remaining

            int rootU = dsu.find(p.u);
            int rootV = dsu.find(p.v);

            if (rootU != rootV) {          // no cycle -> safe edge
                dsu.union(rootU, rootV);
                mstCost += p.w;
                edgesUsed++;
                System.out.println("Take edge " + p.u + "-" + p.v + " w=" + p.w);
            }
        }
        return mstCost;
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("MST cost = " + kruskalMST(graph, V));
    }
}