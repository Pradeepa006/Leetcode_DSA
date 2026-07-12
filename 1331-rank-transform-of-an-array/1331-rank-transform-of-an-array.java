class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] nums = arr.clone();
        Arrays.sort(nums);
        HashMap<Integer , Integer> map = new HashMap<>();
        int rank = 1;
        for(int num : nums) {
            if(!(map.containsKey(num))) {
                map.put(num , rank);
                rank++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}