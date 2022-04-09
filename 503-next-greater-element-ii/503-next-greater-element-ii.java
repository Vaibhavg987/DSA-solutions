class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> st = new Stack<>();
         
        int i=0;
        while(i<2*nums.length){
            int temp = i%nums.length;
            if(st.isEmpty()) st.push(temp);
            else {
                while(!st.isEmpty() && nums[st.peek()] < nums[temp]){
                    ans[st.pop()] = nums[temp];
                }
                st.push(temp);
            }
            i++;
        }
        return ans;
    }
}