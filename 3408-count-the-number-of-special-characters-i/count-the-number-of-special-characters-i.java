class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(arr.contains(word.charAt(i))){
                continue;
            }
            if(Character.isUpperCase(word.charAt(i))){
                if(word.contains(""+Character.toLowerCase(word.charAt(i)))){
                    c++;
                    arr.add(word.charAt(i));
                    arr.add(Character.toLowerCase(word.charAt(i)));
                }
            }
            if(Character.isLowerCase(word.charAt(i))){
                if(word.contains(""+Character.toUpperCase(word.charAt(i)))){
                    c++;
                    arr.add(word.charAt(i));
                    arr.add(Character.toUpperCase(word.charAt(i)));
                }
            }
        }
        return c;
    }
}