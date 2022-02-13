class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        int temp = 0;
        int rev = x;
        while(x!=0){
            int digit = x%10;
            temp = temp*10 + digit;
            x=x/10;
        }
        if(temp == rev) return true;
        return false;
    }
}