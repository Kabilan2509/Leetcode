class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l=0;
        int r=n-1;
        int lm=0,rm=0,ans=0;
        while(l<r){
            if(h[l]<h[r]){
                if(lm>h[l]) ans+=lm-h[l];
                else lm=h[l];
                l++;
            }
            else{
                if(rm>h[r]) ans+=rm-h[r];
                else rm=h[r];
                r--;
            }
        }
        return ans;
    }
}