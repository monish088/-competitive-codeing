class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        int dup = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                dup++;
            } else {
                dup = 1;
            }
            if(dup < 3){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}