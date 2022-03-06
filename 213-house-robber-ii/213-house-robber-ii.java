class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] temp1 = new int[nums.length];       
        int[] temp2 = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i!=0) temp1[i-1] = nums[i];
            if(i!=nums.length-1) temp2[i] = nums[i];
        }
        return Math.max(helper(temp1),helper(temp2));
    }
     public int helper(int[] a){
        int prev = a[0];
        int prev2 = 0;
        for(int j=1;j<a.length;j++){
            int take = a[j];
            if(j>1) take+=prev2;
            int notTake = prev;
            
            int cur = Math.max(take,notTake);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}