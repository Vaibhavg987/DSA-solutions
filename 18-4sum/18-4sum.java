class Solution {
    public static List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int front = j+1;
                int back = n-1;
                int target2 = target - nums[i] - nums[j];
                while(front < back){
                    int sum = nums[front] + nums[back];
                    if(sum < target2) front++;
                    else if(sum > target2) back--;
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[front]);
                        list.add(nums[back]);
                        ans.add(list);
                        
                        while(front < back && nums[front] == list.get(2)) ++front;
                        while(front < back && nums[back] == list.get(3)) --back;
                    }
                }
                while(j+1 < n && nums[j+1] == nums[j]) ++j;
            }
            while(i+1 < n && nums[i+1] == nums[i]) ++i;
        }
        return ans;
    }
}