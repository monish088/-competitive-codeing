class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (sToT.containsKey(charS)) {
                if (sToT.get(charS) != charT) {
                    return false; // Conflict with existing mapping
                }
            } else {
                sToT.put(charS, charT);
            }
            
            if (tToS.containsKey(charT)) {
                if (tToS.get(charT) != charS) {
                    return false; // Conflict with existing mapping
                }
            } else {
                tToS.put(charT, charS);
            }
        }
        
        return true;
    }
}