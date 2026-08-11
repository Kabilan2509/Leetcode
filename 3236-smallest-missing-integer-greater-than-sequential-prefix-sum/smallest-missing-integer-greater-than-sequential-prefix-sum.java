class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        int t = 0;
        int[] psum = new int[nums.length];
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hset.add(nums[i]);
            t += nums[i];
            psum[i] = t;
        }
        int f = -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1] + 1){
                sum = psum[i - 1];
                f++;
                break;
            }
        }
        if(f == -1) t = psum[nums.length - 1];
        else t = sum;
        while(true){
            if(!hset.contains(t)) return t;
            t++;
        }
    }
}