class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                ans[k++] = nums1[i++];
            }
            else{
                ans[k++] = nums2[j++];
            }
        }
        if(i < nums1.length){
            for(int r = i; r < nums1.length; r++){
                ans[k++] = nums1[r];
            }
        }
        else if(j < nums2.length){
            for(int r = j; r < nums2.length; r++){
                ans[k++] = nums2[r];
            }
        }
        // System.out.println(Arrays.toString(ans));
        // System.out.println(k);
        if(k % 2 == 0){
            return (double) (ans[k / 2] + ans[(k / 2) - 1]) / 2;
        }
        return (double) ans[k / 2];
    }
}