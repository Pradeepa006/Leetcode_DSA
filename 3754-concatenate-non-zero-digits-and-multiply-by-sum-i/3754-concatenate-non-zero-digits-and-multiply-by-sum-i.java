class Solution {
    public long sumAndMultiply(int n) {
        long digit = 1;
        long num = 0;
        long sum = 0 ;
        while(n > 0) {
            if(n % 10 > 0) {
                num += ((n%10)*digit);
                digit *= 10;
                sum += n % 10;
            }
            n = n / 10;
        }
        return num * sum;
    }
}