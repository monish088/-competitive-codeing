class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            int numWords = words.length;
            maxWords = Math.max(maxWords, numWords);
        }
        return maxWords;
    }
}