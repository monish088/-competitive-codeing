class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int n = nums.length;

        // int[] res = new int[nums.length];

        // for(int num : nums){
        //     if(num%2 == 0){
        //         res[even] = num;
        //         even += 2;
        //     } else{
        //         res[odd] = num;
        //         odd += 2;
        //     }
        // }
        // return res;

        while(even < n && odd < n){
            while(even < n && nums[even]%2 == 0){
                even += 2;
            }

            while(odd < n && nums[odd]%2 != 0){
                odd += 2;
            }

            if(even < n && odd < n){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
            return nums;
    }
}