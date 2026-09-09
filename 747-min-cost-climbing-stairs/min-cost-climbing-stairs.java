class Solution {
    private int solve(int i, int[] cost, int[] dp){
        if(i < cost.length){
            if(dp[i] != -1){
                return dp[i];
            }
            return dp[i] = cost[i] + Math.min(solve(i + 1 , cost, dp), solve(i + 2 , cost, dp));
        }
        return 0;
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
}