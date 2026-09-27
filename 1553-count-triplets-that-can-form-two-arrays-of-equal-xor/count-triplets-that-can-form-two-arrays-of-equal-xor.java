class Solution {
    public int countTriplets(int[] arr) {
        int a = 0;
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                a ^= arr[j];
                if(a == 0){
                    ans += j - i;
                }
            }
            a = 0;
        }
        return ans;
    }
}