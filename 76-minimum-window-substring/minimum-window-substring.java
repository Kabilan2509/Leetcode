class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        int l=0;
        int formed = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int required = need.size();
        for (int r = 0; r < s.length(); r++){
            char c=s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c) && need.get(c).equals(window.get(c))){
                formed++;
            }
            while(formed==required){
                int len=r-l+1;
                if(len<minLen){
                    minLen=len;
                    start=l;
                }
                char leftchar = s.charAt(l);
                window.put(leftchar, window.get(leftchar) - 1);
                if(need.containsKey(leftchar) && window.get(leftchar)<need.get(leftchar)){
                    formed--;
                }
                l++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLen);
    }
}