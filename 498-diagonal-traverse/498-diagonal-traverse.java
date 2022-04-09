class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int n = matrix.length*matrix[0].length;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ans = new int[n];
        int i=0,j=0;
        for(int k=0;k<ans.length;k++){
            ans[k] = matrix[i][j];
            
            if((i+j) % 2 == 0){
                if(j==col-1) i++;
                else if(i==0) j++;
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==row-1) j++;
                else if(j==0) i++;
                else{
                    i++;
                    j--;
                }
            }
        }
        
        return ans;
    }
}