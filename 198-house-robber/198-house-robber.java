class Solution {
    public int rob(int[] nums) {
        // int[] dp = new int[nums.length];
        // Arrays.fill(dp,-1);
        return helper(nums,nums.length-1);
    }
    public int helper(int[] a,int i){
        int prev = a[0];
        int prev2 = 0;
        for(int j=1;j<a.length;j++){
            int take = a[j];
            if(i>1) take+=prev2;
            int notTake = prev;
            
            int cur = Math.max(take,notTake);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}