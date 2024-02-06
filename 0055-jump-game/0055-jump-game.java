class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // Cannot reach this index
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; // Reached or can reach the last index
            }
        }
        return false; // Cannot reach the last index
    }
}