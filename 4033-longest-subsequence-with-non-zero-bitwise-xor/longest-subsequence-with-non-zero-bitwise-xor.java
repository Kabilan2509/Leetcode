class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        int flag = -1;
        for (int i : nums) {
            ans ^= i;
            if(i != 0){
                flag++;
            }
        }
        if(flag == -1){
            return 0;
        }
        if (ans == 0) {
            return nums.length - 1;
        }
        return nums.length;
    }
}