class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return path(grid.length-1,grid[0].length-1,grid,dp);
    }
    public int path(int i,int j,int[][] a,int[][] dp){
        if(i==0 && j==0) return a[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        
        if(dp[i][j] != 0) return dp[i][j];
        return dp[i][j] = a[i][j] + Math.min(path(i-1,j,a,dp),path(i,j-1,a,dp));
    }
}