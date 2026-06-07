class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int par = 0 ;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] % 2 == 0) 
                par = 0;
            else
                par = 1;
            int count = 0 ;
            for(int j = i + 1 ; j < n ; j++) {
                if(nums[j] % 2 != par) {
                    count++;
                }
            }
            res[i] = count ;
        }

        return res ;
    }
}