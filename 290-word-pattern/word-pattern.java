class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        String[] freq = new String[26];
        HashSet<String> seen = new HashSet<>();
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            int c = pattern.charAt(i) - 'a';
            if (freq[c] != null) {
                if (!freq[c].equals(words[i])) {
                    return false;
                }
            } else {
                if (!seen.add(words[i]))
                    return false;
                freq[c] = words[i];
            }
        }
        return true;
    }
}