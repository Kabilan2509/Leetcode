class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int i = 1;
        int[] val = {26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        for(char c : s.toCharArray()){
            int t = c - 'a';
            ans += (i * val[t]);
            i++;
        }
        return ans;
    }
}