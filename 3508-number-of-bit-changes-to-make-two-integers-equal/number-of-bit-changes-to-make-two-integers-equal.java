class Solution {
    public int minChanges(int n, int k) {
        int xor = n ^ k;
        if((xor | k) != n) return -1;
        return Integer.bitCount(xor);
    }
}