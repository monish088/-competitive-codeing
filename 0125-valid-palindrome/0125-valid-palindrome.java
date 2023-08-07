class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder cleanString = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanString.append(Character.toLowerCase(c));
            }
        }
        
        int left = 0, right = cleanString.length() - 1;
        
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // Palindrome
    }
}