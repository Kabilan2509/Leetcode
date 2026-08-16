class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zero = 0;
        int ones = 0;
        int twos = 0;
        for (int i : stones) {
            if (i % 3 == 0)
                zero++;
            else if (i % 3 == 1)
                ones++;
            else
                twos++;
        }
        if (zero % 2 == 0 && ones > 0 && twos > 0) {
            return true;
        } else if (zero % 2 != 0 && Math.abs(ones - twos) > 2) {
            return true;
        }
        return false;
    }
}