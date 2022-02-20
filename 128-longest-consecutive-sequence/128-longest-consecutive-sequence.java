class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int ans = 1;
        int temp = nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(temp+1 == nums[i]){
                count++;
            }
           else if(temp != nums[i]) count = 1;
            temp = nums[i];
            ans = Math.max(ans,count);
        }
        return ans;
    }
}