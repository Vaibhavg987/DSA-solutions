class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char t: tasks){
            map[t-'A']++;
        }
        Arrays.sort(map);
        int maxVal = map[25]-1;
        int idleSlots = maxVal*n;
        
        for(int i=24;i>=0;i--){
            idleSlots-=Math.min(maxVal,map[i]);
        }
        
        return idleSlots>0 ? idleSlots+tasks.length : tasks.length;
    }
}