class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> ans = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int row = matrix.length;
        int column = matrix[0].length;
        int tne = row*column;
        int count=0;
        while(ans.size()<tne){
            //top wall
            for(int j=minc;j<=maxc && ans.size()<tne ;j++){

                ans.add(matrix[minr][j]);
                // count++;
            }
            minr++;
            // right wall
            for(int i=minr;i<=maxr && ans.size()<tne;i++){
                ans.add(matrix[i][maxc]);
                // count++;
            }
            maxc--;
            //bottom wall
            for(int j=maxc;j>=minc && ans.size()<tne;j--){
                ans.add(matrix[maxr][j]);
                // count++;
            }
            maxr--;
            //left wall
            for(int i=maxr;i>=minr && ans.size()<tne;i--){
                ans.add(matrix[i][minc]);
                // count++;
            }
            minc++;
        }
        return ans;
    }
}