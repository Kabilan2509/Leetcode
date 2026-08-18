class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        int n = nums.length;
        for (int i : nums) {
            freq[i]++;
        }
        if (k == n) {
            int maxx = -1;
            for (int i : nums)
                maxx = Math.max(maxx, i);
            return maxx;
        } else if (k == 1) {
            int maxx = -1;
            for (int i : nums) {
                if (freq[i] == 1) {
                    maxx = Math.max(maxx, i);
                }
            }
            return maxx;
        } else {
            if (freq[nums[0]] == 1 && freq[nums[n - 1]] == 1)
                return Math.max(nums[0], nums[n - 1]);
            else if (freq[nums[0]] > 1 && freq[nums[n - 1]] > 1)
                return -1;
            else {
                if (freq[nums[0]] == 1)
                    return nums[0];
                else
                    return nums[n - 1];
            }
        }
    }
}