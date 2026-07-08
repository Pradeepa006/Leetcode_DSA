class Solution {
    public int removeElement(int[] nums, int k) {
        int n = nums.length;
        int i = 0 ;
        int j = n - 1 ;
        while(i < j) {
            if(nums[i] == k && nums[j] != k) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else if (nums[i] == k && nums[j] == k)
                j--;
            else 
                i++;
        }
        int count = 0;
        for(int x = 0  ; x <  n ; x++) {
            if(nums[x] != k)
                count++;
        }
        return count;
    }
}