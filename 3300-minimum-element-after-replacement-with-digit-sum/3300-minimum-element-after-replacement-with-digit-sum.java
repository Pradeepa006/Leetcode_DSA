class Solution {
    public static int digitSum(int num) {
        int sum = 0 ;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum ;
    }
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            nums[i] = digitSum(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if (min > num) 
                min = num;
        }
        return min;
    }
}