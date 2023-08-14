class Solution {
    public int strStr(String haystack, String needle) {
        int hL = haystack.length();
        int nL = needle.length();

        if(nL == 0 && nL == 1){
            return 0;
        }
        if(hL < nL){
            return -1;
        }

        for(int i = 0; i <= hL - nL; i++){
            if(haystack.substring(i, i + nL).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}