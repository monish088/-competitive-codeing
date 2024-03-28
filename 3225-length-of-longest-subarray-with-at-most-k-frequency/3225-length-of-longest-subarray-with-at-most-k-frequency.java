class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = 0;
        int start = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int end = 0; end < nums.length; end++){
            map.put(nums[end], map.getOrDefault(nums[end],0)+1);
            
            while(map.get(nums[end])>k){
                start++;
                map.put(nums[start],map.get(nums[start])-1);
            }
            maxLen = Math.max(maxLen, end - start);
        }
        return maxLen;
    }
}