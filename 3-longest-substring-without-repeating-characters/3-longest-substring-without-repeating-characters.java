class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        String ans = "";
        int n=s.length();
        for(int i=0;i<n;i++){
            String temp = "";
            for(int j=i;j<n;j++){
                if(!temp.contains(String.valueOf(s.charAt(j)))) temp+=s.charAt(j);
                else break;
            }
            if(ans.length() < temp.length()) ans = temp;
        }
        return ans.length();
    }
}