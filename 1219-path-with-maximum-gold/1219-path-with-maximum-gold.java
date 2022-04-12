class Solution {
    private int max=0;
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] != 0){
                    collectGold(i,j,grid,0);
                }
            }
        }
        return max;
    }
    
    private void collectGold(int i,int j,int[][] a,int mv){
        if(i<0 || j<0 || i>=a.length || j>=a[0].length || a[i][j]==0){
            max = Math.max(max,mv);
            return;
        } 
        int val = a[i][j];
        a[i][j] = 0;
        
        collectGold(i+1,j,a,mv+val);
        collectGold(i-1,j,a,mv+val);
        collectGold(i,j+1,a,mv+val);
        collectGold(i,j-1,a,mv+val);
        
        a[i][j] = val;
    }
}