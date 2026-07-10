class Solution {
    List<List<String>> res = new ArrayList<>();
    public static boolean toCheck(char[][] arr , int row , int col){
        //col 
        for(int i = 0 ; i < row ; i++) {
            if(arr[i][col] == 'Q')
                return false ;
        }

        //left upper 
        int r = row - 1;
        int c = col - 1;
        while(r >= 0 && c >= 0){
            if(arr[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        //right upper
        int i = row - 1;
        int j = col + 1 ;
        while(i >= 0 && j < arr.length){
            if(arr[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
    public void solve(char[][] arr , int n , int row){
        if (row == n) {
            construct(arr);
            return;
        }
        for(int col = 0 ; col < n ; col++) {
            if(toCheck(arr , row , col)) {
                arr[row][col] = 'Q';
                solve(arr , n , row + 1);
                arr[row][col] = '.';
            }
        }
    }
    public void construct(char[][] arr) {
        List<String> li = new ArrayList<>();
        for (char[] row : arr) {
            li.add(new String(row));
        }
        res.add(li);
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i = 0 ; i < n ; i++) {
            Arrays.fill(arr[i] , '.');
        }
        solve(arr, n, 0);
        return res;
    }
}