class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        // Count vowels in the first substring of length k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;

        // Slide the window and update the count of vowels
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                count--; // Remove the leftmost character from the previous window
            }
            if (isVowel(s.charAt(i))) {
                count++; // Add the current character to the window
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}