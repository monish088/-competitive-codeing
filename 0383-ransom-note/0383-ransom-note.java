class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();
        
        // Sort both arrays
        Arrays.sort(ransomArr);
        Arrays.sort(magazineArr);
        
        int i = 0, j = 0;
        
        while (i < ransomArr.length && j < magazineArr.length) {
            if (ransomArr[i] == magazineArr[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        
        return i == ransomArr.length;
    }
}