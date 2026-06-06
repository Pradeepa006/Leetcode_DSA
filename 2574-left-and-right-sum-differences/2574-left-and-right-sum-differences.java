class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        //Delare array
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        //prefix sum
        int index = 1 ;
        int sum = 0 ;
        for(int i = 0 ; i <= n - 2 ; i++) {
            sum = leftSum[index - 1] + nums[i];
            leftSum[index] = sum ;
            index++;
        }

        //sefix sum
        int sum1 = 0 ;
        for(int i = n - 2 ; i >= 0 ; i--) {
            sum1 = rightSum[i + 1] + nums[i + 1];
            rightSum[i] = sum1 ;
        }

        for(int i = 0 ; i < n ; i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return leftSum;
    }
}