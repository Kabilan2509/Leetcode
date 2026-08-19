class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            while(l<r){
                int sum=nums[l]+nums[r]+nums[i];
                if(sum>0){
                    r--;
                    continue;
                }
                else if(sum<0){
                    l++;
                    continue;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}