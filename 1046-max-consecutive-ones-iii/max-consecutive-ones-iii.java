class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[2];
        int left = 0;
        int ans = 0;
        for(int right = 0; right < n; right++){
            freq[nums[right]]++;
            while(freq[0] > k){
                freq[nums[left]]--;
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}