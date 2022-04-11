class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val: nums) sum+=val;
        if(sum%2==1) return false;
        
        int[][] dp = new int[nums.length+1][sum/2+1];
        return f(nums.length-1,sum/2,nums,dp);
    }
    public boolean f(int i,int target,int[] a,int[][] dp){
        if(target == 0) return true;
        if(i==0) return a[i] == target;
        
        if(dp[i][target]!=0){
            if(dp[i][target] == 1) return false;
            else return true;
        }
        boolean notTake = f(i-1,target,a,dp);
        boolean take = false;
        if(a[i]<=target) take = f(i-1,target-a[i],a,dp);
         
        dp[i][target] = notTake || take ? 2 : 1;
        
        return take || notTake;
    }
}