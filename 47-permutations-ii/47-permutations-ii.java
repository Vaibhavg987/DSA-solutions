class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        sol(nums,ds,ans,freq);
        return ans;
    }
    public void sol(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1] && !freq[i-1]) continue;
            if(!freq[i]){
                
                freq[i] = true;
                ds.add(nums[i]);
                sol(nums,ds,ans,freq);
                freq[i] = false;
                ds.remove(ds.size()-1);
                
            }
        }
    }
}