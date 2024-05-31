class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefixXOR = new int[n + 1];

        // Step 1: Compute the prefix XOR array
        for (int i = 0; i < n; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }

        int count = 0;

        // Step 2: Find the triplets (i, j, k) where a == b
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                // Check if the XOR from i to k is zero
                if (prefixXOR[i] == prefixXOR[k + 1]) {
                    // If true, it means for every j between i+1 and k, a == b
                    count += (k - i);
                }
            }
        }

        return count;

    }
}