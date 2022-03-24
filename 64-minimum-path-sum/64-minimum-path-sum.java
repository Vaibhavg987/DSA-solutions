class Solution {
    public int minPathSum(int[][] a) {
        int m = a.length;
        int n = a[0].length;    
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0) dp[i][j] = a[i][j];
                else{
                    int up=a[i][j],left=a[i][j];
                    if(i>0) up += dp[i-1][j];
                    else up+=(int)1e9;
                    if(j>0) left += dp[i][j-1];
                     else left+=(int)1e9;
                    dp[i][j] = Math.min(up,left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}