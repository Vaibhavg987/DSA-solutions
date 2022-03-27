class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int i=matrix.length;
        int j=matrix[0].length;
        int[][] dp = new int[i][j];
        int min = (int)1e9;
        for(int col=0;col<j;col++){
            min = Math.min(min,minPath(i-1,col,matrix,dp));
        }
        return min;
    }
    public int minPath(int i,int j,int[][] a,int[][] dp){
        if(j<0||j>=a[0].length) return (int)1e9;
        if(i==0) return a[0][j];
        
        if(dp[i][j] != 0) return dp[i][j];
        int s = a[i][j] + minPath(i-1,j,a,dp);
        int l = a[i][j] + minPath(i-1,j-1,a,dp);
        int r = a[i][j] + minPath(i-1,j+1,a,dp);
        
        return dp[i][j] = Math.min(s,Math.min(l,r));
    }
}