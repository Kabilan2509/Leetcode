class Solution {
    private int square(int n){
        int ans = 0;
        while(n != 0){
            int r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = square(n);
        int fast = square(square(n));
        while(slow != fast){
            if(slow == 1 || fast == 1){
                return true;
            }
            slow = square(slow);
            fast = square(square(fast));
        }
        return slow == 1;
    }
}