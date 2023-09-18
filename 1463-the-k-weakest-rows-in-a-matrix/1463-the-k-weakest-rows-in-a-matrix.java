class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         int[] result = new int[k];
        int[] strength = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            strength[i] = countSoldiers(mat[i]);
        }

        for (int i = 0; i < k; i++) {
            int minStrength = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < mat.length; j++) {
                if (strength[j] < minStrength) {
                    minStrength = strength[j];
                    minIndex = j;
                        }
            }

            result[i] = minIndex;
            strength[minIndex] = Integer.MAX_VALUE; // Mark this row as visited by setting its strength to a large value
        }

        return result;
    }
      private int countSoldiers(int[] row) {
        int count = 0;
        for (int i : row) {
            if (i == 1) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    
}