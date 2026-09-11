class Solution {
    public int totalNumbers(int[] digits) {
        Map<Integer, Integer> hmap = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        int[] fre = new int[10];
        for (int d : digits) {
            fre[d]++;
        }
        for (int i = 100; i < 1000; i += 2) {
            Map<Integer, Integer> freq = new HashMap<>();
            int num = i;
            while (num > 0) {
                int d = num % 10;
                freq.put(d, freq.getOrDefault(d, 0) + 1);
                num /= 10;
            }
            boolean flag = true;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (fre[entry.getKey()] < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                l.add(i);
            }
        }
        return l.size();
    }
}