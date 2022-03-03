class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        
        int ans=0;
        int prev=0;
        // int[] dp = new int[nums.length];
        for(int i=2;i<nums.length;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                prev+=1;
                ans+=prev;
            }else prev=0;
        }
        return ans;
    }
}