import java.util.*;

class Solution {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Method to add an element to the heap
        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2;  // parent index

            // Heapify-up to maintain the min-heap property
            while (x > 0 && arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // Method to display the heap
        public void display() {
            System.out.println("Heap: " + arr);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        // Sample array of integers
        int[] sampleArray = {2,3,4,10,5,1};

        // Adding elements to the heap
        for (int num : sampleArray) {
            heap.add(num);
        }

        // Display the heap
        heap.display();
    }
}