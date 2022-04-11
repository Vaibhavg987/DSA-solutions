class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length == 1) return false;
        int sum = 0;
        for(int val: nums) sum+=val;
        if(sum%2==1) return false;
        
       	return find(nums,sum/2);

	}
	public boolean find(int []nums,int t){
		boolean dp[]=new boolean[t+1];
		dp[0]=true;
		for(int i=0;i<nums.length;i++){
			for(int j=t;j>0;j--){
				if(j>=nums[i]) dp[j]|= dp[j-nums[i]]; 
			}
		}
		return dp[t];
	}
}