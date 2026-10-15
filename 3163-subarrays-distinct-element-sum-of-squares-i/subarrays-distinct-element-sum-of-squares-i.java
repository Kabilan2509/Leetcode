class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            ans++;
            set.add(nums.get(i));
            for(int j = i + 1; j < n; j++){
                set.add(nums.get(j));
                int t = set.size();
                ans += (t * t);
            }
            set.clear();
        }
        return ans;
    }
}