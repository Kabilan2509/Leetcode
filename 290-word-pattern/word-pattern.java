class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        // System.out.println(Arrays.toString(words));
        HashMap<Character, String> hmap = new HashMap<>();
        if (pattern.length() != words.length) {
            // System.out.println(Arrays.toString(words));
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (hmap.containsKey(c)) {
                if (!hmap.get(c).equals(words[i])) {
                    return false;
                }
            } 
            else {
                if(hmap.containsValue(words[i])) return false;
                hmap.put(c, words[i]);
            }
        }
        return true;
    }
}