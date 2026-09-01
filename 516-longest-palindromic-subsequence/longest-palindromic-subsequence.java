class Solution {
    int m = 0;
    private int check(String s, int i, int j, int[][] dp){
        if(i > j){
            return 0;
        }
        if(i == j){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = 2 + check(s, i + 1, j - 1, dp);
        }
        return dp[i][j] = Math.max(check(s, i + 1, j, dp),check(s, i, j - 1, dp));
    }
    public int longestPalindromeSubseq(String s) {
        m = s.length();
        int[][] dp = new int[m][m];
        for(int[] k : dp){
            Arrays.fill(k,-1);
        }
        return check(s, 0, m - 1, dp);
    }
}