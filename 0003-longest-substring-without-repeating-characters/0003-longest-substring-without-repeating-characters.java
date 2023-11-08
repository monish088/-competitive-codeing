class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        HashSet<Character> charSet = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        int right = 0;

        while (right < n) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}