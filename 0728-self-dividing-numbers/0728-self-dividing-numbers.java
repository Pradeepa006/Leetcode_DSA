class Solution {
    public boolean selfDiv(int n){
        int num = n ;
        while(n > 0) {
            int d = n % 10;
            if (d == 0)
                return false;
            if(num % d != 0)
                return false;
            n = n / 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for(int i = left ; i <= right ; i++) {
            if(selfDiv(i))
                nums.add(i);
        }
        return nums;
    }
}