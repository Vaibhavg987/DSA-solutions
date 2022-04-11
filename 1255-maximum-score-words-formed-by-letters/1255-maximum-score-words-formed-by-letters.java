class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
         int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
        return f(words,farr,score,0);
    }
    public int f(String[] words,int[] f,int[] score,int ind){
        if(ind >= words.length) return 0;
        
        int sno = f(words,f,score,ind+1);
        
        int sword = 0;
        String word = words[ind];
        boolean flag = true;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(f[ch - 'a']==0) flag = false;
            f[ch - 'a']--;
            sword += score[ch - 'a'];
        }
        int syes=0;
        if(flag) 
            syes = sword + f(words,f,score,ind+1);
        
         for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            
            f[ch - 'a']++;
         }
        return Math.max(sno,syes);
    }
}