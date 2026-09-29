class Solution {
    public int compress(char[] chars) {
        int right=0;
        int left=0;
        while(right<chars.length){
            char curr=chars[right];
            int count=0;
            while(right<chars.length&&chars[right]==curr){
                right++;
                count++;
            }
            chars[left++]=curr;
            if(count>1){
                for(char c:Integer.toString(count).toCharArray())
                {
                    chars[left++]=c;
                }
            }
        }
        return left;
    }
}