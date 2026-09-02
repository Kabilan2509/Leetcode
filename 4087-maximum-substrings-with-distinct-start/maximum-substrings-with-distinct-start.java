class Solution {
    public int maxDistinct(String s) {
        boolean[] freq = new boolean[26];
        int ans = 0;
        for(char c : s.toCharArray()){
            if(!freq[c - 'a']){
                freq[c - 'a'] = true;
                ans++;
            }
        }
        return ans;
    }
}