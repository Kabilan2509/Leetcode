class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0;
        int score = 0;
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ')' && s.charAt(i - 1) == '('){
                score += Math.pow(2,depth--);
            }
            else if(c == '('){
                depth++;
            }
            else{
                depth--;
            }
        }
        return score;
    }
}