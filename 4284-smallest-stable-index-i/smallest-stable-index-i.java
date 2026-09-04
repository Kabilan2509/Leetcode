class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minn = new int[n];
        minn[n - 1] = nums[n - 1];
        int ma = Integer.MIN_VALUE;
        for(int i = n - 2; i >= 0; i--){
            minn[i] = Math.min(minn[i + 1],nums[i]);
        }
        for(int i = 0; i < n; i++){
            ma = Math.max(ma,nums[i]);
            if(ma - minn[i] <= k){
                return i;
            }
        }
        return -1;
    }
}