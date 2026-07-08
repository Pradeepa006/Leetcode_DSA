class Solution {
    public static void swap(int[] nums , int a , int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0 ;
        int n = nums.length;
        int end = n -1 ;
        int mid =  0;

        while(mid <= end) {
            if(nums[mid] == 0) {
                swap(nums , mid , low);
                mid++;
                low++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else{
                swap(nums , mid , end);
                end--;
            }
        }
    }
}