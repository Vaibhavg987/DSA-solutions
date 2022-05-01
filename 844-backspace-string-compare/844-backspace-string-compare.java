class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        char[] str1 = s.toCharArray();
        for(int i=0;i<str1.length;i++){
            if(str1[i] =='#'){
                if(s1.size()>=1) s1.pop();
            }else{
                s1.add(str1[i]);
            }
        }
        char[] str2 = t.toCharArray();
        for(int i=0;i<str2.length;i++){
            if(str2[i] == '#'){
                if(s2.size()>=1) s2.pop();
            }else{
                s2.add(str2[i]);
            }
        }
        if(s1.size() < s2.size() || s2.size() < s1.size()) return false;
        for(int i=0;i<s1.size();i++){
            if(s1.get(i) != s2.get(i)){
                return false;
            }
        }
        return true;
    }
}