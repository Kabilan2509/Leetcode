class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        int[] ans = new int[nums.length];
        int l = 0;
        ans[0] = nums[0];
        int ind = 1;
        for(int r = 1; r < nums.length; r++){
            if(nums[l] != nums[r]){
                l = r;
                c++;
                ans[ind++] = nums[r];
            }
        }
        for(int i = 0; i < c; i++){
            nums[i] = ans[i];
        }
        // System.out.println(c);
        return c;
    }
}