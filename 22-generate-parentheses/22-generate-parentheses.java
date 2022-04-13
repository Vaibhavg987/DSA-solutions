class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",0,0,n);
        return ans;
    }
    public void helper(List<String> list,String str,int open,int close,int max){
        if(str.length() == 2*max){
            list.add(str);
            return;
        }
        
        if(open < max) helper(list,str+"(",open+1,close,max);
        if(close < open) helper(list,str+")",open,close+1,max);
    }
}