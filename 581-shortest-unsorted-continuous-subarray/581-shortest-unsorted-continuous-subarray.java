class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] a = nums.clone();
        Arrays.sort(a);
        int start = a.length,end = 0;
        
        for(int i=0;i<a.length;i++){
            if(nums[i] != a[i]){
                start = Math.min(i,start);
                end = Math.max(i,end);
            }
        }
        return (end-start >=0) ? (end-start+1) : 0;
    }
}