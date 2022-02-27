class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int size = num.length-1;
        while(size>=0 || k!=0){
         if(size>=0){
             k+=num[size];
             size--;
         }   
            ans.addFirst(k%10);
            k=k/10;
        }
        return ans;
    }
}