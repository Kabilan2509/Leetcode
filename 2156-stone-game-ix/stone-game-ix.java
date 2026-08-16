class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int i : stones) {
            count[i % 3]++;
        }
        int zero = count[0];
        int ones = count[1];
        int twos = count[2];
        if (zero % 2 == 0 && ones > 0 && twos > 0) {
            return true;
        } else if (zero % 2 != 0 && Math.abs(ones - twos) > 2) {
            return true;
        }
        return false;
    }
}