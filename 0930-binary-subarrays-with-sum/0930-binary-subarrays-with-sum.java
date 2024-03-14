class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumCounts = new HashMap<>();
        
        for (int num : nums) {
            sum += num;
            if (sum == goal) {
                count++;
            }
            count += sumCounts.getOrDefault(sum - goal, 0);
            sumCounts.put(sum, sumCounts.getOrDefault(sum, 0) + 1);
        }
        
        return count;
        
    }
}