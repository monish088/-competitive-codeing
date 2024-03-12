class Solution {
    public String customSortString(String order, String s) {
         // Count characters in s
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Build the result string according to the custom order
        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (count[c - 'a']-- > 0) {
                result.append(c);
            }
        }
        
        // Append remaining characters from s
        for (char c = 'a'; c <= 'z'; c++) {
            while (count[c - 'a']-- > 0) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}