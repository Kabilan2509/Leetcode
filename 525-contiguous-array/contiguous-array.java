class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            sum+=nums[i];
            if(hmap.containsKey(sum)){
                maxLen=Math.max(maxLen,i-hmap.get(sum));
            }
            else{
                hmap.put(sum,i);
            }
        }
        return maxLen;
    }
}