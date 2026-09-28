class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int c = 0;
        for(char ca : s.toCharArray()){
            if(ca == '('){
                c++;
                ans = Math.max(ans,c);
            }
            else if(ca == ')'){
                c--;
            }
        }
        return ans;
    }
}