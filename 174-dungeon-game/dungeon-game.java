class Solution {
    int m = 0, n = 0;

    private int health(int[][] d, int i, int j, int[][] dp) {
        if (i >= m || j >= n)
            return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1)
            return d[i][j] > 0 ? 1 : Math.abs(d[i][j]) + 1;
        if (dp[i][j] != Integer.MIN_VALUE)
            return dp[i][j];
        int down = health(d, i + 1, j, dp);
        int right = health(d, i, j + 1, dp);
        return dp[i][j] = Math.max(1, Math.min(down, right) - d[i][j]);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        m = dungeon.length;
        n = dungeon[0].length;
        int[][] dp = new int[m][n];
        int t = Integer.MIN_VALUE;
        for (int[] k : dp)
            Arrays.fill(k, t);
        return health(dungeon, 0, 0, dp);
    }
}