class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;

        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j -i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}