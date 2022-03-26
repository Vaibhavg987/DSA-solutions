class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return tabulation(triangle);
    }
    public int tabulation(List<List<Integer>> triangle){
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int j=0;j<triangle.get(triangle.size()-1).size();j++){
            dp[triangle.size()-1][j] = triangle.get(triangle.size()-1).get(j);
        }
        for(int i=dp.length-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int diagonal = triangle.get(i).get(j) + dp[i+1][j+1];
                
                dp[i][j] = Math.min(down,diagonal);
            }
        }
        return dp[0][0];
    }
}