class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int t = n;
        while (t != 0) {
            int temp = t % 10;
            sum += temp;
            mul *= temp;
            t /= 10;
        }
        if (n % (sum + mul) == 0)
            return true;
        return false;
    }
}