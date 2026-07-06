class Solution {
    public boolean isValidSudoku(char[][] board) {

        //Row check 
        int[] row = new int[9];
        for(int i = 0 ; i < 9; i++) {
            Arrays.fill(row, 0);
            for(int j = 0 ; j < 9 ; j++){
                char ch = board[i][j];
                if(ch != '.') {
                    row[ch - '1']++;
                    if(row[ch - '1'] > 1) {
                        return false;
                    }
                }
            }
        }
        //Col check 
        int[] col = new int[9];
        for(int i = 0 ; i < 9; i++) {
            Arrays.fill(col, 0);
            for(int j = 0 ; j < 9 ; j++){
                char ch = board[j][i];
                if(ch != '.') {
                    col[ch - '1']++;
                    if(col[ch - '1'] > 1) {
                        return false;
                    }
                }
            }
        }
        //Grid check 
        int[] grid = new int[9];
        for(int box = 0 ; box < 9 ; box++){
            Arrays.fill(grid, 0);
            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;
            for(int i = startRow ; i < startRow + 3; i++) {
            for(int j = startCol ; j < startCol + 3 ; j++){
                char ch = board[i][j];
                if(ch != '.') {
                    grid[ch - '1']++;
                    if(grid[ch - '1'] > 1) {
                        return false;
                    }
                }
            }
        }
        }
        return true;
    }
}