class Solution {
    public char repeatedCharacter(String s) {
        List<Character> seen = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(seen.contains(c)){
                return c;
            }
            seen.add(c);
        }
        return ' ';
    }
}