class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        int k = 0;
        for(int i = 0; i < n; i++){
            ans[k++] = nums[i];
        }
        for(int i = n - 1; i >= 0; i--){
            ans[k++] = nums[i];
        }
        return ans;
    }
}