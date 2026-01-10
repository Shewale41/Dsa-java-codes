class Solution {
    public static boolean isValid(int nums[], int k, int maxAllowed) {
        int students = 1, pages = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxAllowed) {
                return false;
            }
            if (nums[i] + pages <= maxAllowed) {
                pages += nums[i];
            } else {
                pages = nums[i];
                students++;
            }
        }
        return students <= k;
    }

    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int start = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            sum += nums[i];
        }
        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(solution.splitArray(nums, k)); // Output: 18
    }
}
