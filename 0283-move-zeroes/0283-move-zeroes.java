class Solution {
    public void moveZeroes(int[] nums) {
        // int k = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // for(int i = k; i < nums.length; i++){
        //     nums[i] = 0;
        // }
         // Initialize a pointer to keep track of the position to place the next non-zero element
        int insertPos = 0;
        
        // Iterate through the array
        for (int num : nums) {
            // If the current element is non-zero, move it to the current insert position and increment the insert position
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        
        // Fill the remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
    }
}
}