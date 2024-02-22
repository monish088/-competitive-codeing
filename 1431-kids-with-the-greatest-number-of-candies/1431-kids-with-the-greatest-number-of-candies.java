class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //  // Find the maximum number of candies among all kids
        // int maxCandies = Arrays.stream(candies).max().getAsInt();
        
        // // Initialize a boolean array to store the result
        // List<Boolean> result = new ArrayList<>();
        
        // // Iterate through each kid's candies
        // for (int i = 0; i < candies.length; i++) {
        //     // Check if the current kid can have the greatest number of candies
        //     result.add(candies[i] + extraCandies >= maxCandies);
        // }
        
        // return result;
        int max = -1;

        for(int a : candies){
            if(a > max){
                max = a;
            }
        }

        List<Boolean> list = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            list.add(candies[i]+extraCandies >= max);
        }
        return list;
    }
}