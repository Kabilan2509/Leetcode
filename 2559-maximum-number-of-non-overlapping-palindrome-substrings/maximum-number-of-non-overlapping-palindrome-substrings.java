class Solution {
    private boolean check(int l, int r, String s){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int ans = 0;
        int start = 0;
        int l = 0;
        for(int r = k - 1; r < s.length(); r++){
            l = r - k + 1;
            if(l >= start && check(l,r,s)){
                ans++;
                start = r + 1;
                continue;
            }
            l = r - k;
            if(l >= start && check(l,r,s)){
                ans++;
                start = r + 1;
            }
        }
        return ans;
    }
}