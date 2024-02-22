class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n+1];
        int[] outDegree = new int[n+1];

        for(int[] ele : trust){
            int u = ele[0];
            int v = ele[1];

            outDegree[u]++;
            inDegree[v]++;
        }
        for(int i = 1; i <= n; i++){
            if(inDegree[i] == (n-1) && outDegree[i] == 0){
                return i;
            }
        }
        return -1;
    }
}