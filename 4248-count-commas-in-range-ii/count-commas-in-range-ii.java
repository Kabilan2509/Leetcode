class Solution {
    public long countCommas(long n) {
        long tot = 0;
        for (long i = 1000; i <= n; i *= 1000) {
            tot += (n - i + 1);
        }
        return tot;
    }
}