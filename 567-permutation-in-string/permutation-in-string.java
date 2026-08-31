class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int k = s1.length();
        int left = 0;
        int[] window = new int[26];
        for (int r = 0; r < s2.length(); r++) {
            window[s2.charAt(r) - 'a']++;
            if (r - left + 1 > k) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }
            if (r - left + 1 == k) {
                if (Arrays.equals(window, freq)) {
                    return true;
                }
            }
        }
        return false;
    }
}