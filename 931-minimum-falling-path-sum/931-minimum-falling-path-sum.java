class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp = new int[m][n];
        for(int j=0;j<n;j++) dp[0][j] = matrix[0][j];
        for(int i=1;i<m;i++){
           for(int j=0;j<n;j++){
                int s = matrix[i][j] + dp[i-1][j];
               int l = matrix[i][j];
               if(j-1>=0) l+=dp[i-1][j-1];
               else l+=(int)1e8;
               
               int r = matrix[i][j];
               if(j+1<n) r+= dp[i-1][j+1];
                 else r+=(int)1e8;
               
               dp[i][j] = Math.min(s,Math.min(l,r));
           }
        }
        int min = (int)1e8;
        for(int col=0;col<n;col++){
            min = Math.min(min,dp[m-1][col]);
        }
        return min;
    }
//     public int minPath(int i,int j,int[][] a,int[][] dp){
//         if(j<0||j>=a[0].length) return (int)1e9;
//         if(i==0) return a[0][j];
        
//         if(dp[i][j] != 0) return dp[i][j];
       
//         return dp[i][j] = Math.min(s,Math.min(l,r));
//     }
}