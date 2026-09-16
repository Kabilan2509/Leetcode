class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char c : s1.toCharArray()){
            freq1[c - 'a']++;
        }
        int l = 0;
        int n = s2.length();
        int r = 0;
        int k = s1.length();
        while(r < n){
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
            if(r - l + 1 > k){
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }
            else{
                freq2[s2.charAt(r) - 'a']++;
                r++;
            }
        }
        return Arrays.equals(freq1,freq2);
    }
}