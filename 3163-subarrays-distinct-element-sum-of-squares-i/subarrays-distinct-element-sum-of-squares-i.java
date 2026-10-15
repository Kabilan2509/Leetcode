class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        int count = 1;
        for(int i = 0; i < n; i++){
            boolean[] visited = new boolean[101];
            count = 1;
            ans++;
            visited[nums.get(i)] = true;
            for(int j = i + 1; j < n; j++){
                if(!visited[nums.get(j)]){
                    visited[nums.get(j)] = true;
                    count++;
                }
                ans += (count * count);
            }
        }
        return ans;
    }
}