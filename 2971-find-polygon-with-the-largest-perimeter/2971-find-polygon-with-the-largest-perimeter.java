class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long res = -1;
        long total = 0;

        for(int num : nums){
            if(total > num){
                res = total + num;
            }
            total += num;
        }
        return res;
    }
}