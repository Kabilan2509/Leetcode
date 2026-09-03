class Solution {
    public boolean uniformArray(int[] nums1) {
        int minn = Integer.MAX_VALUE;
        for (int i : nums1) {
            minn = Math.min(minn, i);
        }
        if(minn % 2 == 1){
            return true;
        }
        for (int i : nums1) {
            if(i % 2 == 1){
                return false;
            }
        }
        return true;
    }
}