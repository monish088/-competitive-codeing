class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1,arr2);

         Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Subtract character occurrences in the second string
        for (char c : t.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            if (count == 0) {
                // Character not present in the first string
                return false;
            }
            charCountMap.put(c, count - 1);
        }

        // Check if all character counts are zero
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}