class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
       return paths(m,n,0,0,dp);
    }
    public int paths(int row,int col,int i,int j,int[][] dp){
        if(i==row || j==col) return 0;
        if(i==row-1 && j==col-1) return 1;
        
        if(dp[i][j] != 0) return dp[i][j];
       int rows = paths(row,col,i+1,j,dp);
        int cols = paths(row,col,i,j+1,dp);
        
        return dp[i][j] = rows+cols;
    }
}