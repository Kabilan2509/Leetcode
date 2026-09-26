class Solution {
    public void sortColors(int[] nums) {
        int zi=0,ti=nums.length-1,itr=0;
        while(itr<=ti){
            if(nums[itr]==0){
                int t=nums[itr];
                nums[itr]=nums[zi];
                nums[zi]=t;
                itr++;
                zi++;
            }
            else if(nums[itr]==1) itr++;
            else{
                int t =nums[itr];
                nums[itr]= nums[ti];
                nums[ti]=t;
                ti--;
            }
        }
    }
}