class Solution {
    public boolean uniformArray(int[] nums1) {
        int minn_o = Integer.MAX_VALUE;
        for (int i : nums1) {
            if (i % 2 != 0) {
                minn_o = Math.min(minn_o, i);
            }
        }
        for (int i : nums1) {
            if (i % 2 == 0 && i < minn_o && minn_o != Integer.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }
}