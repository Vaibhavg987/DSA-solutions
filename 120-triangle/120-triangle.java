class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return path(0,0,triangle,dp);
    }
    public int path(int i,int j,List<List<Integer>> triangle,int[][] dp){
        if(i==triangle.size()-1) return triangle.get(i).get(j);
        
        if(dp[i][j]!=-1) return dp[i][j];
        int bottom = triangle.get(i).get(j) + path(i+1,j,triangle,dp);
        int diagonal = triangle.get(i).get(j) + path(i+1,j+1,triangle,dp);
        
        return dp[i][j] = Math.min(bottom,diagonal);
    }
}