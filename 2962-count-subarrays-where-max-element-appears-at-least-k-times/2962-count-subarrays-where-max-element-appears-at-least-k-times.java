class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max = 0, count = 0;
        long left = 0;
        long right = 0, ans = 0;

        for(int num : nums){
            max = Math.max(max, num);
        }

        while(right < nums.length || left > right){
            if(nums[(int)right] == max){
                count++;
            }
            while(count>= k){
                if(nums[(int)left] == max){
                    count--;
                }
                left++;
                ans += nums.length - right;         
                }
                right++;
        }
        return ans;

    }
}