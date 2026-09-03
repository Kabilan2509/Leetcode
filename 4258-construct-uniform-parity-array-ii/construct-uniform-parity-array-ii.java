class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd_c = 0;
        int minn_o = Integer.MAX_VALUE;
        for (int i : nums1) {
            if (i % 2 != 0) {
                odd_c++;
                minn_o = Math.min(minn_o, i);
            }
        }
        for (int i : nums1) {
            if (i % 2 == 0 && i < minn_o && odd_c != 0) {
                return false;
            }
        }
        return true;
    }
}