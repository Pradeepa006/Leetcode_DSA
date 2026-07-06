class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0 ; i < arr1.length ; i++) {
            int num = arr1[i];
            while(num > 0) {
                set1.add(num);
                num = num / 10;
            }
        }
        int count = 0 ;
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            while (num > 0) {
                if (set1.contains(num)) {
                    count = Math.max(count, Integer.toString(num).length());
                    break;
                }
                num = num / 10;
            }
        }
        return count;
    }
}