class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            } else{
                map.put(x,1);
            }
        }
        Set<Integer> set = new HashSet<>();

        for(int x : map.values()){
            set.add(x);
        }
        return map.size() == set.size();
    }
}