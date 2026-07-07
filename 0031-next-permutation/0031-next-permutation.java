class Solution {

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {

        int n = nums.length - 1;
        int pivot = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot != -1) {

            int idx = n;

            while (nums[idx] <= nums[pivot]) {
                idx--;
            }

            int temp = nums[idx];
            nums[idx] = nums[pivot];
            nums[pivot] = temp;
        }

        reverse(nums, pivot + 1, n);
    }
}