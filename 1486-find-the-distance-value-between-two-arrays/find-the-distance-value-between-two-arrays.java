class Solution {
    private boolean check(int k, int[] arr2, int d){
        for(int i : arr2){
            if(Math.abs(k - i) <= d){
                return false;
            }
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i : arr1){
            if(check(i,arr2,d)){
                count++;
            }
        }
        return count;
    }
}