class Solution {
    public boolean isMonotonic(int[] nums) {
        int idx1 = 0, idx2 = 1;
        while(idx2 < nums.length && nums[idx1] == nums[idx2])
            idx2++;
        if(idx2 == nums.length)
            return true;
        int n = nums[idx1] - nums[idx2];

        if(n < 0) {
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] > nums[i + 1])
                    return false;
            }
        }
        else if(n > 0) {
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] < nums[i + 1])
                    return false;
            }
        }
        return true;
    }
}