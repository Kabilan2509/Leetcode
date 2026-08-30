class Solution {
    public int minimumDeletions(int[] nums) {
        int minn_i = 0;
        int maxx_i = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < nums[minn_i]){
                minn_i = i;
            }
            if(nums[i] > nums[maxx_i]){
                maxx_i = i;
            }
        }
        int low = Math.min(minn_i,maxx_i);
        int high = Math.max(minn_i,maxx_i);
        int option1 = high + 1;
        int option2 = n - low;
        int option3 = low + 1 + n - high;
        return Math.min(Math.min(option1,option2),option3);
    }
}