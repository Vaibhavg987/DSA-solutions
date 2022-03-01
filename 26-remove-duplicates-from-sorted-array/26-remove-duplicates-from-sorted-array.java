class Solution {
    public int removeDuplicates(int[] nums) {
        // int j=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[count-1] !=nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

