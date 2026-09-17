class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int le = 0;
        int n = numbers.length;
        int r = n - 1;
        int csum = 0;
        while(le < r){
            csum += numbers[le];
            csum += numbers[r];
            if(csum == target){
                ans[0] = le + 1;
                ans[1] = r + 1;
                break;
            }
            else if(csum > target){
                r--;
                csum = 0;
            }
            else{
                le++;
                csum = 0;
            }
        }
        return ans;
    }
}