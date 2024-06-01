class Solution {
    public String largestNumber(int[] nums) {
         // Convert the integers to strings
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // Sort the strings based on custom comparator
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Reverse order for descending sort
            }
        });

        // If the highest number is "0", the result is "0"
        if (strs[0].equals("0")) {
            return "0";
        }

        // Join the sorted strings
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str);
        }

        return result.toString();
    }
}