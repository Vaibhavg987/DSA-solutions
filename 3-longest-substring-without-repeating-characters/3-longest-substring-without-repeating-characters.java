class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
        int count=0,max=0;
        int left=0,right=0;
        
       while(left<s.length() && right<s.length()){
           if(!set.contains(s.charAt(right))){
               set.add(s.charAt(right));
               right++;
                max = Math.max(max,set.size());
           }
           else{
               set.remove(s.charAt(left));
  
               left++;
               
           }
          
       }
        return max;
    }
}