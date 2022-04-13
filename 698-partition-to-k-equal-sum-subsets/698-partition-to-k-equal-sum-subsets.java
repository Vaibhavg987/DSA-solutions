class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int val: nums) sum+=val;
        if(sum%k != 0) return false;
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        return check(nums,nums.length-1,0,visited,sum/k,k);
    }
    public boolean check(int[] a,int ind,int sum,boolean[] visited,int target,int k){
        if(k==0) return true;
        if(sum == target) return check(a,a.length-1,0,visited,target,k-1);
        
        for(int i=ind;i>=0;i--){
            if(!visited[i] && sum+a[i] <= target){
                visited[i] = true;
                if(check(a,i-1,sum+a[i],visited,target,k)) return true;
                visited[i] = false;
            }
        }
        return false;
    }
}