class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int actualSum = n*(n+1)/2;
        int arrSum = 0;
        int uniqueSum = 0;

        Set<Integer> set = new HashSet<>();

        for(int a : nums){
            arrSum += a;
        }
        for(int a : nums){
            set.add(a);
        }
        for(int a : set){
            uniqueSum += a;
        }
        
         int missing = actualSum - uniqueSum;
         int duplicate = arrSum - uniqueSum;

         return new int[]{duplicate,missing};

    }
}