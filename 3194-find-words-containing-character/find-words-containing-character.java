class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            int[] freq = new int[26];
            for(char c : words[i].toCharArray()){
                freq[c - 'a']++; 
            }
            if(freq[x - 'a'] != 0){
                l.add(i);
            }
        }
        return l;
    }
}