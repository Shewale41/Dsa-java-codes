import java.util.*;
class Solution {
    public static int KthLargestOdd(int L, int R, int K) {
        // Create a list to store odd numbers
        List<Integer> oddNumbers = new ArrayList<>();

        // Collect odd numbers in the range
        for (int i = L; i <= R; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        // Sort the odd numbers in descending order
        Collections.sort(oddNumbers, Collections.reverseOrder());

        // Return the k-th largest odd number
        if (K <= oddNumbers.size()) {
            return oddNumbers.get(K - 1);
        } else {
            return -1; // Return -1 if K is out of bounds
        }
    }

    public static void main(String[] args) {
        int L = -3;
        int R = 7;
        int K = 2;
        System.out.println(KthLargestOdd(L, R, K)); // Output: 15
    }
}
