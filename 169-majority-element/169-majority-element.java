class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max=0;
        int count=0,maxCount=0;
        for(int i=0;i<nums.length-1;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > maxCount){
                max = nums[i];
                maxCount = count;
            }
        }
        return max;
    }
}