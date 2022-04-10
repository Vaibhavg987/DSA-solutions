class Solution {
    public int largestRectangleArea(int[] h) {
       Stack<Integer> s=new Stack<>();
        int[]left=new int[h.length];
        int k=0,ans=0;
        int[]right=new int[h.length];
        for(int i=0;i<h.length;i++){
            
            while(!s.isEmpty()&&h[s.peek()]>=h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                s.push(i);
                left[k++]=0;
            }else{
                left[k++]=s.peek()+1;
                s.push(i);
            }
        }
       
        s.clear();k--;
        for(int i=h.length-1;i>=0;i--){
            while(!s.isEmpty()&&h[s.peek()]>=h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                s.push(i);
                right[k--]=h.length-1;
            }else{
                right[k--]=s.peek()-1;
                s.push(i);
            }
        }
      
        for(int i=0;i<h.length;i++){
            ans = Math.max((right[i]-left[i]+1)*h[i],ans);
        }
        return ans;
    }
}
    
