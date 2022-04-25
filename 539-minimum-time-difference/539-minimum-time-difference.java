class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] seen = new boolean[24*60];
        
        for(String time: timePoints){
            String[] timesplit = time.split(":");
            int hour = Integer.parseInt(timesplit[0]);
            int min = Integer.parseInt(timesplit[1]);
            if(seen[(hour*60) + min]) return 0;
            seen[(hour*60) + min] = true;
        }
        
        Integer firstTime = null;
        Integer prevTime = null;
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0;i<seen.length;i++){
            if(seen[i]){
                if(firstTime == null){
                    firstTime = i;
                    prevTime = i;
                }else{
                    minDiff = Math.min(minDiff,Math.min(i-prevTime,1440-i+firstTime));
                    prevTime = i;
                }
            }
        }
        return minDiff;
    }
}