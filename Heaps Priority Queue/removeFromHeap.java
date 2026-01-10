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

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int idx){

            int minIdx=idx;
            int left=2*idx+1;
            int right=2*idx+2;

            if(left < arr.size()-1 && arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right < arr.size()-1 && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }
            if(idx!=minIdx){
                int temp=arr.get(idx);
                arr.set(idx,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }

        public int removeFromHeap(){
            int data=arr.get(0);
            //step -1 swap first and last element
            int temp= arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step -2 remove the last element
            arr.remove(arr.size()-1);

            //step -3 fix the heap 
            heapify(0);
            return data;
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
        heap.removeFromHeap();
        heap.display();
    }
}