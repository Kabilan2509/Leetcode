class Solution {
    private void solve(int open, int close, int n, String current, List<String> ans){
        if(open == n && close == n){
            ans.add(current);
            return;
        }
        if(open < n){
            solve(open + 1,close,n,current + "(",ans);
        }
        if(close < open){
            solve(open,close + 1,n,current + ")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(0, 0, n, "", ans);
        return ans;
    }
}