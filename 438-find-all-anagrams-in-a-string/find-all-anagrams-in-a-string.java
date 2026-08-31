class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        ArrayList<Integer> l = new ArrayList<>();
        for(char c : p.toCharArray()){
            freq[c - 'a']++;
        }
        int[] lfreq = new int[26];
        int siz = p.length();
        int left = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            lfreq[c - 'a']++;
            while(lfreq[c - 'a'] > freq[c - 'a']){
                lfreq[s.charAt(left) - 'a']--;
                left++;
            }
            if(Arrays.equals(lfreq,freq)){
                l.add(left);
            }
        }
        return l;
    }
}