class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length == 1) return false;
        int sum = 0;
        for(int val: nums) sum+=val;
        if(sum%2==1) return false;
        
        int target = sum/2;
        int n = nums.length;
        int[][] dp = new int[n][target+1];

	for(int t = 0; t <= target; t++) {
		dp[0][t] = (t == nums[0]) ? 1 : 0;
	}
	for(int i = 0; i < n; i++)
		dp[i][0] = 1;

	for(int i = 1; i < n; i++) {
		for(int t = 1; t <= target; t++) {
			int notpick = dp[i-1][t];
			int pick = 0;
			if(nums[i] <= t) {
				pick = dp[i-1][t-nums[i]];
			}
			dp[i][t] = (notpick == 1 || pick == 1) ? 1 : 0;
		}
	}

	return dp[n-1][target] == 1 ? true : false;
    }
   
}