class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Initialize two arrays to store products from left and right
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        
        // Fill the leftProducts array with the product of elements to the left of each index
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Fill the rightProducts array with the product of elements to the right of each index
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // Calculate the final product by multiplying left and right products
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }
}