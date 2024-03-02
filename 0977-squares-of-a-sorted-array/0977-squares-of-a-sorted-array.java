class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] res = new int[nums.length];
        // int left = 0;
        // int right = nums.length - 1;
        // for(int i = nums.length - 1; i >= 0; i--){
        //     if(Math.abs(nums[left]) > Math.abs(nums[right])){
        //         res[i] = nums[left] * nums[left];
        //         left++;
        //     } else {
        //         res[i] = nums[right] * nums[right];
        //         right--;
        //     }
        // }
        // return res;
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        
        return result;
    }
}