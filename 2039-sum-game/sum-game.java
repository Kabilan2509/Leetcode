class Solution {
    public boolean sumGame(String num) {
        int lsum = 0;
        int ls = 0;
        int rsum = 0;
        int rs = 0;
        for(int i = 0; i < num.length() / 2; i++){
            char c = num.charAt(i);
            if(c >= '0' && c <= '9'){
                lsum += c - '0';
            }
            else{
                ls++;
            }
        }
        for(int i = num.length() / 2; i < num.length(); i++){
            char c = num.charAt(i);
            if(c >= '0' && c <= '9'){
                rsum += c - '0';
            }
            else{
                rs++;
            }
        }
        if((ls + rs) % 2 != 0){
            return true;
        }
        if((lsum - rsum) + ((ls - rs) / 2) * 9 == 0){
            return false;
        }
        return true;
    }
}