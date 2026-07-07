class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top = 0;
        int left = 0 ;
        int bottom = n - 1;
        int right = n - 1;
        int val = 1;
        while(top <= bottom && left <= right) {
            //left - right ---top - row
            for(int i = left ; i <= right ; i++) {
                arr[top][i] = val;
                val++;
            }
            top++;

            //top - bottom --- right - col
            for(int i = top ; i <= bottom ; i++) {
                arr[i][right] = val;
                val++;
            }
            right--;

            //right - left --- bottom - row
            if(top<=bottom) {
                for(int i = right ; i >= left ; i--) {
                    arr[bottom][i] = val;
                    val++;
                }
                bottom--;
            }

            //bottom - top --- left - col
            if(left <= right) {
                for(int i = bottom ; i >= top ; i--) {
                    arr[i][left] = val;
                    val++;
                }
                left++;
            }
        }
        return arr;
    }
}