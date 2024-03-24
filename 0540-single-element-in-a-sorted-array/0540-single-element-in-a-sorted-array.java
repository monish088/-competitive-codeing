class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }

        // for(int num : nums){
        //     if(map.get(num) == 1){
        //         return num;
        //     }
        // }
        // return -1;
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is even
            if (mid % 2 == 1) {
                mid--; // Adjust mid to be even
            }
            
            // If mid and mid+1 are equal, single element lies to the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Single element lies to the left
                right = mid;
            }
        }
        
        return nums[left];

    }
}