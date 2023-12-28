class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n <= 0){
            return matrix;
        }
        int top = 0, bottom = n- 1, left = 0, right = n - 1;
        int num = 1;

        while(top <= bottom && left <= right){
            //traversing top row
            for(int i = left; i <= right; i++){
                matrix[top][i] = num++;
            }
            top++;

            //traversing right coloum
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num++;
            }
            right--;

            //traversing bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            // Traverse left column
             if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            } 
        }
        return matrix;
    }
}