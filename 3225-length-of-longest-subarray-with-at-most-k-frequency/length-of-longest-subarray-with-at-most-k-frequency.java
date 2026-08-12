class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            hmap.put(nums[right], hmap.getOrDefault(nums[right], 0) + 1);
            while (hmap.get(nums[right]) > k) {
                int value = nums[left];
                hmap.put(value, hmap.get(value) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}