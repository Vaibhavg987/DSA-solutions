class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longestStreak = 0;
        for(int num: nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int streak = 1;
                
                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    streak+=1;
                }
                longestStreak = Math.max(longestStreak, streak);
            }
            
        }
        return longestStreak;
    }
} 