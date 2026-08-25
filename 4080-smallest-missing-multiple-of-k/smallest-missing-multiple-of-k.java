class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] freq = new int[1001];
        int maxx = Integer.MIN_VALUE;
        for (int i : nums) {
            freq[i]++;
            maxx = Math.max(maxx, i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i * k] == 0) {
                return i * k;
            }
        }
        return (nums.length + 1) * k;
    }
}