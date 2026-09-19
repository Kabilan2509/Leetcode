class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0;
        for(int i : nums){
            arr[k++] = i;
        }
        for(int i = 0; i < k; i++){
            nums[i] = arr[nums[i]];
        }
        return nums;
    }
}