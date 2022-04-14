class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        int row = board.length;
        int col = board[0].length;
        
        for(int i=0;i<row;i++){
            if(board[i][0] == 'O') bfs(board,i,0);
            if(board[i][col-1] == 'O') bfs(board,i,col-1);
        }
        for(int i=0;i<col;i++){
            if(board[0][i] == 'O') bfs(board,0,i);
            if(board[row-1][i] == 'O') bfs(board,row-1,i);
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }
    public void bfs(char[][] a,int i,int j){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length) return;
        
        if(a[i][j] == 'O') a[i][j] = '*';
        if(i>0 && a[i-1][j] == 'O') bfs(a,i-1,j);
        if(i<a.length-1 && a[i+1][j] == 'O') bfs(a,i+1,j);
        if(j>0 && a[i][j-1] == 'O') bfs(a,i,j-1);
        if(j<a[0].length-1 && a[i][j+1] == 'O') bfs(a,i,j+1);
        
        return;
    }
}