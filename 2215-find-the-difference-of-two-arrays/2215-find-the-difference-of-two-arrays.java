class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for(int i = 0 ; i < nums1.length ; i++) {
            n1.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ; i++) {
            n2.add(nums2[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int x : n1) {
            if(!(n2.contains(x))) {
                 arr.add(x);
             }
        }
        res.add(arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        for(int x : n2) {
            if(!(n1.contains(x))) {
                 arr1.add(x);
             }
        }
        res.add(arr1);
        return res;
    }
}