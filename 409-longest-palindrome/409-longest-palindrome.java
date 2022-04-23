class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        int[] count = new int[128];
        for(char c: s.toCharArray()){
            count[c]++;
        }
        int ans=0;
        boolean odd = false;
        for(int i='A';i<='z';i++){
            if(count[i] % 2 == 0) ans+=count[i];
            else{
                ans+=count[i]-1;
                odd = true;
            }
        }
        return odd ? ans + 1 : ans;
    }
}