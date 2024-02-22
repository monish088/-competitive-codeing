class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a character array for easier manipulation
        char[] chars = s.toCharArray();
        
        // Define a set containing all vowels (both lower and upper case)
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        // Initialize two pointers, one starting from the beginning and one from the end of the string
        int left = 0, right = s.length() - 1;
        
        // Continue until the two pointers meet or cross each other
        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            
            // Move the right pointer to the previous vowel
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }
            
            // Swap the vowels at positions left and right
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        // Convert the character array back to a string and return
        return new String(chars);
    }
}