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
            boolean flag = true;
            while (num > 0) {
                int d = num % 10;
                if(fre[d] == 0){
                    flag = false;
                    break;
                }
                freq[d]++;
                num /= 10;
            }
            if(!flag){
                continue;
            }
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