class Solution {
    private int fibb(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibb(n - 1, dp) + fibb(n - 2, dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        return fibb(n, dp);
    }
}