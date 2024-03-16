class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1); // Initialize the map with 0 sum at index -1
        
        for (int i = 0; i < nums.length; i++) {
            // Increment count for 1 and decrement for 0
            count += nums[i] == 1 ? 1 : -1;
            
            // If the count is already seen before, update maxLength
            if (sumIndexMap.containsKey(count)) {
                maxLength = Math.max(maxLength, i - sumIndexMap.get(count));
            } else {
                sumIndexMap.put(count, i); // Put count in the map with current index
            }
        }
        
        return maxLength;
    }
}