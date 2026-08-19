class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        // get frequencies
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }

        int comp = Integer.MIN_VALUE;
        int index = -1;
        int i = 0;

        while (i < k) {
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() > comp) {
                    index = e.getKey();
                    comp = e.getValue();
                }
            }
            result[i] = index;
            map.remove(index);
            comp = Integer.MIN_VALUE;
            index = -1;
            i++;
        }

        return result;
    }
}
