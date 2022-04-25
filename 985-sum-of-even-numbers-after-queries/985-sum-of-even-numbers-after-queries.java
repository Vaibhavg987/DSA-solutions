class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        
        int evenSum = 0;
        for(int num: nums){
            if(num%2 == 0){
                evenSum+=num;
            }
        }
        
        for(int i=0;i<queries.length;i++){
            int index = queries[i][1];
            int value = queries[i][0];
            
            if(nums[index]%2==0){
                evenSum-=nums[index];
            }
            nums[index]+=value;
            
             if(nums[index]%2==0){
                evenSum+=nums[index];
            }
            
            ans[i] = evenSum;
        }
        return ans;
    }
}