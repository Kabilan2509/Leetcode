class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            int t=0;
            for(char c:s.toCharArray()){
                t+=weights[c-'a'];
            }
            sb.append((char)('z'-(t%26)));
        }
        return sb.toString();
    }
}