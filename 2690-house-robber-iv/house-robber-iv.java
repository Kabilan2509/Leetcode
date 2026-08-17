class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i : nums) {
            right = Math.max(right, i);
        }
        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] <= mid) {
                    count++;
                    i++;
                }
            }
            if (count >= k)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}