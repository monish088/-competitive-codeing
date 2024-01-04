class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int pLength = p.length();

        for (int i = 0; i <= s.length() - pLength; i++) {
            String substring = s.substring(i, i + pLength);
            if (isAnagram(substring, p)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}