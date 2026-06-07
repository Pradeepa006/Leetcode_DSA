class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int odd = 0, even = 0;

        for(int num : nums) {
            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        for(int i = 0; i < n; i++) {

            if(nums[i] % 2 == 0) {
                even--;          // remove current even
                res[i] = odd;    // opposite parity to the right
            } else {
                odd--;           // remove current odd
                res[i] = even;   // opposite parity to the right
            }
        }

        return res;
    }
}