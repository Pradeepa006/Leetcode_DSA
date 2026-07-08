class Solution {
    public boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        for(int n : nums) {
            if(x >= n)
                x = n;
            else if (y >= n)
                y = n;
            else 
                return true;
        }

        return false;
    }
}