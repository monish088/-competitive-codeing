class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positiveNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();

        // Separate positive and negative integers
        for (int num : nums) {
            if (num > 0) {
                positiveNums.add(num);
            } else {
                negativeNums.add(num);
            }
        }

        int[] rearrangedNums = new int[nums.length];
        int i = 0, j = 0, k = 0;

        // Merge positive and negative integers
        while (i < positiveNums.size() && j < negativeNums.size()) {
            rearrangedNums[k++] = positiveNums.get(i++);
            rearrangedNums[k++] = negativeNums.get(j++);
        }

        // Append any remaining positive or negative integers
        while (i < positiveNums.size()) {
            rearrangedNums[k++] = positiveNums.get(i++);
        }

        while (j < negativeNums.size()) {
            rearrangedNums[k++] = negativeNums.get(j++);
        }

        return rearrangedNums;
    }
}