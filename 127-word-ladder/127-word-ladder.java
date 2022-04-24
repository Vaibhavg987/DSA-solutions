class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(String word: wordList) set.add(word);
        
        if(!set.contains(endWord)) return 0;
        
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level=1;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                String currentWord = q.poll();
                char[] wordChar = currentWord.toCharArray();
                for(int j=0;j<wordChar.length;j++){
                    char originalChar = wordChar[j];
                    for(char c='a';c<='z';c++){
                        if(wordChar[j] == c) continue;
                        wordChar[j] = c;
                        String newWord = String.valueOf(wordChar);
                        if(newWord.equals(endWord)) return level+1;
                        if(set.contains(newWord)){
                            q.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                    wordChar[j] = originalChar;
                }
            }
            level++;
        }
        return 0;
    }
}