class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);

        }

        List<Integer> res = new ArrayList<>();
        for(int key : mp.keySet()){
            if(mp.get(key) == 1){
                res.add(key);
            }
        }
        int[] arr = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            arr[i] = res.get(i);
        }
        
        return arr;

    }
}