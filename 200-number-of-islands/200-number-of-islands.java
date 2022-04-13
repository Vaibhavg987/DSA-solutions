class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                count+=1;
                search(grid,i,j);
                }
            }
        }
        return count;
    }
    public void search(char[][] a, int i, int j){
        if(i<0 || i>=a.length || j<0 || j>=a[i].length || a[i][j]=='0') return;
        
        a[i][j] = '0';
        search(a,i+1,j);
        search(a,i,j+1);
        search(a,i-1,j);
        search(a,i,j-1);
    }
}