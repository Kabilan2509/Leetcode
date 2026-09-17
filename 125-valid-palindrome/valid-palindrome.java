class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int h = s.length()-1;
        while(l<=h){
            int cl = (int) s.charAt(l);
            int ch = (int) s.charAt(h);
            if(cl >=65 && cl<=90) { //uppercase
                cl = cl+32; //Uppercase to lowercase ascii
            }
            if(ch >=65 && ch<=90) { //uppercase
                ch = ch+32; //Uppercase to lowercase ascii
            }
            if(cl<48 || (cl>57 && cl < 65) || (cl > 90 && cl < 97) || cl > 122) { //non alphanum chars
                l++;
                continue;
            }
            if(ch<48 || (ch>57 && ch < 65) || (ch > 90 && ch < 97) || ch > 122) { //non alphanum chars
                h--;
                continue;
            }
            if(cl!=ch) return false;
            l++;
            h--;
        }
        return true;
    }
}