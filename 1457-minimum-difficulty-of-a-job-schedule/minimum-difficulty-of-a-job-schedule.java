class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
         int n = jobDifficulty.length;
        if (n < d) {
            return -1;
        }

        int[][] dp = new int[d + 1][n + 1];
        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return dfs(jobDifficulty, d, 0, dp);
    }

    private int dfs(int[] jobDifficulty, int d, int index, int[][] dp) {
        int n = jobDifficulty.length;

        if (d == 0 && index == n) {
            return 0;
        }

        if (d == 0 || index == n) {
            return Integer.MAX_VALUE;
        }

        if (dp[d][index] != -1) {
            return dp[d][index];
        }

        int maxDifficulty = 0;
        int minDifficulty = Integer.MAX_VALUE;

        for (int i = index; i < n; i++) {
            maxDifficulty = Math.max(maxDifficulty, jobDifficulty[i]);
            int remainingDifficulty = dfs(jobDifficulty, d - 1, i + 1, dp);
            if (remainingDifficulty != Integer.MAX_VALUE) {
                minDifficulty = Math.min(minDifficulty, maxDifficulty + remainingDifficulty);
            }
        }

        dp[d][index] = minDifficulty;
        return minDifficulty;
    }
}