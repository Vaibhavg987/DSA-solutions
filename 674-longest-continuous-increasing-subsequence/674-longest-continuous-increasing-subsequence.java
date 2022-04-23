class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1) return 1;
        int left=0,right=1;
        int count=1;
        int ans = Integer.MIN_VALUE;
        while(left < right && right<nums.length){
            if(nums[right] > nums[right-1]) {
                right++;
                count++;
            }
            else {
                count = 1;
                left = right;
                right++;
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
}