class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;

        int totalSum = (n*(n+1))/2;

        int eleSum =  0;
        for(int i = 0; i < n; i++){
            eleSum += nums[i];
        } 

        return totalSum - eleSum;
    }
}