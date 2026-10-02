class Solution {
    private void solve(int open, int close, int pos, int n, char[] current, List<String> ans){
        if(open == n && close == n){
            ans.add(new String(current));
            return;
        }
        if(open < n){
            current[pos] = '(';
            solve(open + 1,close,pos + 1,n,current,ans);
        }
        if(close < open){
            current[pos] = ')';
            solve(open,close + 1,pos + 1,n,current,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] s = new char[2 * n];
        solve(0, 0, 0, n, s, ans);
        return ans;
    }
}