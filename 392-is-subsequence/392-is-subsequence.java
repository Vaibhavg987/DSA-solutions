class Solution {
    public boolean isSubsequence(String s, String t) {
        int validSize = s.length();
        int i=0,j=0;
        int count=0;
        
        while(i<validSize && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count==validSize;
    }
}