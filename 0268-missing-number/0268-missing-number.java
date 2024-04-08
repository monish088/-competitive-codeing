class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tot_Sum = (n*(n+1))/2;
        int sum = 0;

        for(int num : nums){
            sum += num;
        }
        return tot_Sum - sum;
        
    }
}