class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int ans = Integer.MIN_VALUE;
        while(l < r){
            if(height[l] < height[r]){
                ans = Math.max(ans, height[l] * (r - l));
                l++;
            }
            else{
                ans = Math.max(ans, height[r] * (r - l));
                r--;
            }
        }
        return ans;
    }
}