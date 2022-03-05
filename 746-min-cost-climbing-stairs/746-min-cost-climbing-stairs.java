class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        mincost(cost,0,dp);
        return Math.min(dp[0],dp[1]);
    }
    public int mincost(int[] cost,int step,int[] dp){
        if(step>=cost.length) return 0;
        
        if(dp[step]!=0) return dp[step];
        dp[step] = cost[step] + Math.min(mincost(cost,step+1,dp),mincost(cost,step+2,dp));
        return dp[step];
    }
}