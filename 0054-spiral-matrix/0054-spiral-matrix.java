class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n  = matrix.length;
        int m = matrix[0].length;

        List<Integer> res = new ArrayList<>();
        int top = 0 ;
        int left = 0 ;
        int bottom = n - 1 ;
        int right = m - 1;
        
        while(top <= bottom && left <= right) {
            //left - right --- top fixed
            for(int i = left ; i <= right ; i++)
                res.add(matrix[top][i]);
            top++;
            
            //top - bottom --- right fixed
            for(int i = top ; i <= bottom ; i++)
                res.add(matrix[i][right]);
            right--;
            
            //right-left ---bottom fixed
            if (top <= bottom) {
                for(int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for(int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
            
            //bottom - top --- left fixed
            // for(int i = bottom ; i >= top ; i++) 
            //     System.out.print(arr[i][left] + " ");
            // left++;
            
        }
        return res;
    }
}