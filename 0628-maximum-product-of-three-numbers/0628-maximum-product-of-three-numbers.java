class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;

        if(n < 3){
            return -1;
        }
        Arrays.sort(nums);
         int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        
        // Calculate the maximum product considering both positive and negative numbers
        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;
        
        return Math.max(product1, product2);
    }
}