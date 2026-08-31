class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int r = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            while(!dq.isEmpty() && dq.peekFirst() < left){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[right]){
                dq.pollLast();
            }
            dq.offerLast(right);
            if(right - left + 1 == k){
                ans[r++] = nums[dq.peekFirst()];
                left++;
            }
        }
        return ans;
    }
}