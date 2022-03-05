class Solution {
    public int deleteAndEarn(int[] nums) {
        int inc=0;
        int exc=0;
        int[] count = new int[10001];
        for(int num:nums) count[num]++;
        
        for(int i=0;i<count.length;i++){
            int ni = exc+count[i]*i;
            int ne = Math.max(inc,exc);
            inc=ni;
            exc=ne;
        }
        return Math.max(inc,exc);
    }
}