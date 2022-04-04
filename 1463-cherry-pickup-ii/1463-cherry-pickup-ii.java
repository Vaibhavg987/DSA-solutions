class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        return f(0,0,m-1,grid,dp);
    }
    public int f(int i,int j1,int j2,int[][] a,int[][][] dp){
        if(j1<0 || j1>=a[0].length || j2<0 || j2>=a[0].length) return (int)-1e8;
        
        if(i==a.length-1){
            if(j1==j2) return a[i][j1];
            else return a[i][j1] + a[i][j2];
        }
        if(dp[i][j1][j2] != 0) return dp[i][j1][j2];
        int max=(int)-1e8;
        
        for(int dj1=-1;dj1<=+1;dj1++){
            for(int dj2=-1;dj2<=+1;dj2++){
                int val=0;
                if(j1==j2) val = a[i][j1];
                else val = a[i][j1] + a[i][j2];
                val+=f(i+1,j1+dj1,j2+dj2,a,dp);
                max = Math.max(max,val);
            }
        }
        return dp[i][j1][j2] = max;
    }
}