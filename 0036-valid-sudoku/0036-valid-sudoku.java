class Solution {
    public boolean isValidSudoku(char[][] board) {
       // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, i, 0, 8)) {
                return false;
            }
        }
        
        // Check columns
        for (int j = 0; j < 9; j++) {
            if (!isValid(board, 0, 8, j, j)) {
                return false;
            }
        }
        
        // Check 3x3 sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid(board, i, i + 2, j, j + 2)) {
                    return false;
                }
            }
        }
        
        return true; 
    }
     private boolean isValid(char[][] board, int startX, int endX, int startY, int endY) {
        boolean[] used = new boolean[10];
        
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (used[num]) {
                        return false;
                    }
                    used[num] = true;
                }
            }
        }
        
        return true;
    }
}