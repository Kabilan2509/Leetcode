class Solution {
    public int totalNumbers(int[] digits) {
        Map<Integer, Integer> hmap = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        int[] fre = new int[10];
        for (int d : digits) {
            fre[d]++;
        }
        for (int i = 100; i < 1000; i += 2) {
            int[] freq = new int[10];
            int num = i;
            while (num > 0) {
                int d = num % 10;
                freq[d]++;
                num /= 10;
            }
            boolean flag = true;
            for (int k = 0; k < 10; k++) {
                if (fre[k] < freq[k]) {
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