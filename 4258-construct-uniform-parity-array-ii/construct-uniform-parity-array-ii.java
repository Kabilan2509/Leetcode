class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd_c = 0;
        int even_c = 0;
        int minn_o = Integer.MAX_VALUE;
        int minn_e = Integer.MAX_VALUE;
        for(int i : nums1){
            if(i % 2 == 0){
                even_c++;
                minn_e = Math.min(minn_e,i);
            }
            else{
                odd_c++;
                minn_o = Math.min(minn_o,i);
            }
        }
        for(int i : nums1){
            if(i % 2 == 0 && i < minn_o && odd_c != 0){
                return false;
            }
            // else if(i % 2 != 0 && i < minn_e){
            //     return false;
            // }
        }
        return true;
    }
}