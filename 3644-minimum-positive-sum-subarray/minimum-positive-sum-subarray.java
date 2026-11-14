class Solution {
    private int check(List<Integer> nums, int i, int l){
        int sum = 0;
        if(i + l > nums.size()){
            return -1;
        }
        for(int j = i; j < i + l; j++){
            if(j >= nums.size()){
                break;
            }
            sum += nums.get(j);
        }
        if(sum <= 0){
            return -1;
        }
        return sum;
    }
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minn = Integer.MAX_VALUE;
        for(int i = l; i <= r; i++){
            for(int j = 0; j < nums.size(); j++){
                int ans = check(nums,j,i);
                if(ans == -1){
                    continue;
                }
                minn = Math.min(minn,ans);
            }
        }
        return minn == Integer.MAX_VALUE ? -1 : minn;
    }
}