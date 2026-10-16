class Solution {
    private String toBinaryWithBits(int num, int bits) {
        String binaryStr = Integer.toBinaryString(num);
        if (binaryStr.length() > bits) {
            return binaryStr.substring(binaryStr.length() - bits);
        }
        return String.format("%" + bits + "s", binaryStr).replace(' ', '0');
    }
    public int minChanges(int n, int k) {
        String b1 = Integer.toBinaryString(n);
        String b2 = Integer.toBinaryString(k);
        int c = 0;
        int l = b1.length();
        if(b1.length() > b2.length()){
            b2 = toBinaryWithBits(k,b1.length());
            l = b1.length();
        }
        else{
            b1 = toBinaryWithBits(n,b2.length());
            l = b2.length();
        }
        char[] b11 = b1.toCharArray();
        char[] b22 = b2.toCharArray();
        for(int i = 0; i < l; i++){
            if(b11[i] == '1' && b22[i] == '0'){
                b11[i] = '0';
                c++;
            }
        }
        if(Arrays.equals(b11,b22)){
            return c;
        }
        return -1;
    }
}