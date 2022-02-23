class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 1){
            ans.add(nums[0]);
            return ans;
        }
        int count1=0,count2=0,num1=-1,num2=-1;
        for(int num: nums){
            if(num==num1) count1++;
            else if(num==num2) count2++;
            else if(count1==0){
                num1=num;
                count1=1;
            } 
            else if(count2==0){
                num2=num;
                count2=1;
            } 
            else{
                count1--;
                count2--;
            }
        }
        int c1=0,c2=0;
        for(int num: nums){
            if(num == num1) c1++;
            else if(num == num2) c2++;
        }
        if(c1 > nums.length/3) ans.add(num1);
        if(c2 > nums.length/3) ans.add(num2);
        return ans;
    }
}