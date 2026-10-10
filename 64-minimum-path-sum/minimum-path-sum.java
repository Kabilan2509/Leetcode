class Solution {
    private int check(int[][] grid,int i,int j,int[][] dp,int m,int n){
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int down=check(grid,i+1,j,dp,m,n);
        int right=check(grid,i,j+1,dp,m,n);
        return dp[i][j]=grid[i][j]+Math.min(down,right);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] dp = new int[m][n];
        return check(grid,0,0,dp,m,n);
    }
}