class Solution {
    public int minOperations(int[] nums, int x) {
         int n = nums.length;
        int targetSum = Arrays.stream(nums).sum() - x;

        if (targetSum < 0) {
            return -1;
        }

        if (targetSum == 0) {
            return n;
        }

        int left = 0;
        int right = 0;
        int currentSum = 0;
        int minOperations = Integer.MAX_VALUE;

        while (right < n) {
            currentSum += nums[right];
            right++;

            while (currentSum > targetSum) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == targetSum) {
                minOperations = Math.min(minOperations, n - (right - left));
            }
        }

        return (minOperations != Integer.MAX_VALUE) ? minOperations : -1;
    }
}