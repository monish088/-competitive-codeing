class Solution {
    public int minCostClimbingStairs(int[] cost) {
         int n = cost.length;
        int[] dp = new int[n];
        
        // Base cases
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        // Dynamic programming approach to calculate minimum cost
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        
        // Minimum cost to reach the top can be from the last or second last step
        return Math.min(dp[n-1], dp[n-2]);
    }
}