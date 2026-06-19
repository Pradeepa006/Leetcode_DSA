class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] res = new int[n + 1];
        res[0] = 0;
        for(int i = 0 ; i < n ;i++) {
            res[i + 1] = res[i] + gain[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n + 1 ; i++) {
            if(res[i] > max) 
                max = res[i];
        }
        return max;
    }
}