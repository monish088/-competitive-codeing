class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, maxending = 0;
        for(int i = 0; i < nums.length; i++){
            maxending = maxending + nums[i];
            if(maxSoFar < maxending)
                maxSoFar = maxending;
            if(maxending < 0)
                maxending = 0;
            
        }
        return maxSoFar;
    }
}