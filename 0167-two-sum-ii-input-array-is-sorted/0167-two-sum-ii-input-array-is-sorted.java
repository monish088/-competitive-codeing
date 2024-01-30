class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Adding 1 to convert from 0-based to 1-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // No solution found
        return new int[]{-1, -1};
    }
}