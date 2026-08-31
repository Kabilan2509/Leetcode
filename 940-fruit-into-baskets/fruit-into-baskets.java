class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int left = 0;
        int n = fruits.length;
        int ans = 0;
        for (int right = 0; right < n; right++) {
            int t = fruits[right];
            hmap.put(t, hmap.getOrDefault(t, 0) + 1);
            while(hmap.size() > 2){
                hmap.put(fruits[left],hmap.get(fruits[left])-1);
                if(hmap.get(fruits[left]) <= 0){
                    hmap.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}