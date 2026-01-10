import java.util.*;

class Solution {
    public static void main(String args[]) {
        int arr[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        // PriorityQueue with a custom comparator to compare points based on their distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> {
            int dist1 = p1[0] * p1[0] + p1[1] * p1[1];
            int dist2 = p2[0] * p2[0] + p2[1] * p2[1];
            return dist1 - dist2; // Min-heap based on distance
        });

        // Add all points to the priority queue
        for (int[] point : arr) {
            pq.add(point);
        }

        // Retrieve the k closest points
        System.out.println("The " + k + " closest points to the origin are:");
        for (int i = 0; i < k; i++) {
            int[] point = pq.remove(); // Remove the closest point
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }
}