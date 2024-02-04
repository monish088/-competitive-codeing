class Solution {
    public String minWindow(String s, String t) {
         // Create a map to store the characters in t and their counts
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        // Initialize variables for the sliding window
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = targetMap.size();
        int formed = 0;
        Map<Character, Integer> windowMap = new HashMap<>();

        // Start sliding the window
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            // Check if the current character is in t and if its count matches the required count
            if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            // Try to minimize the window by moving the left pointer
            while (left <= right && formed == requiredChars) {
                char leftChar = s.charAt(left);

                // Update the minimum window if applicable
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                // Move the left pointer
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar).intValue() < targetMap.get(leftChar).intValue()) {
                    formed--;
                }
                left++;
            }

            // Move the right pointer
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}