class Solution {
    public String pushDominoes(String str) {
        char[] dominoes = str.toCharArray();
        int n = dominoes.length;
        int[] forces = new int[n];
        
        int force=0;
        for(int i=0;i<n;i++){
            if(dominoes[i] == 'R'){
                force = n;
            }else if(dominoes[i] == 'L'){
                force = 0;
            }else{
                force = Math.max(force-1,0);
            }
            forces[i]+=force;
        }
        
        force=0;
        for(int i=n-1;i>=0;i--){
            if(dominoes[i] == 'L'){
                force = n;
            }else if(dominoes[i] == 'R'){
                force = 0;
            }else{
                force = Math.max(force-1,0);
            }
            forces[i]-=force;
        }
        
        StringBuilder ans = new StringBuilder();
        for(Integer f: forces){
            if(f>0) ans.append('R');
            else if(f<0) ans.append('L');
            else ans.append('.');
        }
        
        return ans.toString();
    }
}