class Solution {
    private int sum(int n) {
        int su = 0;
        while (n != 0) {
            su += n % 10;
            n /= 10;
        }
        return su;
    }

    public int smallestIndex(int[] nums) {
        int[] dp = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            if(dp[nums[i]] == 0){
                dp[nums[i]] = sum(nums[i]);
            }
            if(dp[nums[i]] == i){
                return i;
            }
        }
        return -1;
    }
}