class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int prev = nums[0];
        int curr = Math.max(nums[0], nums[1]);
        int next = 0;
        for(int i = 2; i < n; i++){
            next = Math.max(curr, prev + nums[i]);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}