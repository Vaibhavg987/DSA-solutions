class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        res.add(s);
        dfs(s.toCharArray(),0,res);
        return res;
    }
    
    public void dfs(char[] s,int ind,List<String> res){
        for(int i=ind;i<s.length;i++){
            if ( Character.isAlphabetic(s[i]) ) {
            char temp = s[i];
            s[i] = (Character.isLowerCase(s[i]) ? Character.toUpperCase(s[i]) : Character.toLowerCase(s[i]));
            res.add(new String(s));
            dfs(s,i+1,res);
            s[i]=temp;
        }
        }
    }
}