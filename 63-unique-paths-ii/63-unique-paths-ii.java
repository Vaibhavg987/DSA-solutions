class Solution {
   public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length ;
        int n = arr[0].length;
    
        return solve(m-1 , n - 1 , arr, new int[m][n]);
    }
    int solve(int m, int n, int[][] arr, int[][] dp){
        if(m>=0 && n>=0 && arr[m][n]==1)return 0;
      
        if(m<0 || n<0)return 0;
      
        if(m==0 && n==0)return 1;
    
        if(dp[m][n]>0) return dp[m][n];

        int up = solve(m-1, n, arr, dp);
        int left = solve(m, n-1, arr, dp);
        
        return dp[m][n] = left+up;
    }
}