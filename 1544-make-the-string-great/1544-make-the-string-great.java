class Solution {
    public String makeGood(String s) {
         StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - c) == 32) {
                // If the current character and the last character in sb form a pair
                // with one being uppercase and the other being lowercase
                // then remove the last character from sb
                sb.deleteCharAt(sb.length() - 1);
            } else {
                // Otherwise, append the current character to sb
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}