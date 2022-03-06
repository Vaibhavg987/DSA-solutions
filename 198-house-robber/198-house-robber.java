class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);
    }
    public int helper(int[] a,int i,int[] dp){
        if(i==0) return a[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = a[i]+helper(a,i-2,dp);
        int nonPick = 0+helper(a,i-1,dp);
        
        return dp[i] = Math.max(pick,nonPick);
    }
}