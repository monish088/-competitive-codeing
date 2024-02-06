class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] count = new char[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String str = new String(count);

            if(!mp.containsKey(str)){
                mp.put(str, new ArrayList<>());
            }
            mp.get(str).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}