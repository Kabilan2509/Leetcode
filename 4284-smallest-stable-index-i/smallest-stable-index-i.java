class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minn = new int[n];
        Arrays.fill(minn,Integer.MAX_VALUE);
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        for(int i = n - 1; i >= 0; i--){
            if(mi > nums[i]){
                mi = nums[i];
            }
            minn[i] = mi;
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