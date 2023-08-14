class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}