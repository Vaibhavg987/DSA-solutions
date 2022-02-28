class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(n==1){
            return 0;
        }
        int i=0;
        int j= n-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            maxArea = Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return maxArea;
    }
}