class Solution {
    public int totalNumbers(int[] digits) {
        Map<Integer, Integer> hmap = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for (int d : digits) {
            hmap.put(d, hmap.getOrDefault(d, 0) + 1);
        }
        for (int i = 100; i < 1000; i += 2) {
            Map<Integer, Integer> freq = new HashMap<>();
            int num = i;
            while (num > 0) {
                int d = num % 10;
                freq.put(d,freq.getOrDefault(d,0) + 1);
                num /= 10;
            }
            boolean flag = true;
            for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
                if(hmap.getOrDefault(entry.getKey() , 0) < entry.getValue()){
                    flag = false;
                    break;
                }
            }
            if(flag){
                l.add(i);
            }
        }
        return l.size();
    }
}