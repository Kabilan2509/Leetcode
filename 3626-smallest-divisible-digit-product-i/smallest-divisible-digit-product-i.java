class Solution {
    private int product(int n) {
        int temp = n;
        int pro = 1;
        while (temp != 0) {
            pro *= temp % 10;
            if (pro == 0)
                return 0;
            temp /= 10;
        }
        return pro;
    }

    public int smallestNumber(int n, int t) {
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if (product(i) % t == 0) {
                return i;
            }
        }
        return n;
    }
}