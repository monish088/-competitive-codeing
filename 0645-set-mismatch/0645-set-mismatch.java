class Solution {
    public int[] findErrorNums(int[] nums) {
        // int n = nums.length;
        // int actualSum = n*(n+1)/2;
        // int arrSum = 0;
        // int uniqueSum = 0;

        // Set<Integer> set = new HashSet<>();

        // for(int a : nums){
        //     arrSum += a;
        // }
        // for(int a : nums){
        //     set.add(a);
        // }
        // for(int a : set){
        //     uniqueSum += a;
        // }
        
        //  int missing = actualSum - uniqueSum;
        //  int duplicate = arrSum - uniqueSum;

        //  return new int[]{duplicate,missing};

        int n = nums.length;
        int[] v = new int[n + 1];
        int missing = 0, duplicate = 0;

        for (int i = 0; i < n; i++) {
            v[nums[i]]++;
        }

        for (int i = 1; i < v.length; i++) {
            if (v[i] == 2) {
                duplicate = i;
            }
            if (v[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};

    }
}