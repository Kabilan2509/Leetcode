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
            if(freq[0] <= k){
                ans = Math.max(ans,right - left + 1);
            }
        }
        return ans;
    }
}