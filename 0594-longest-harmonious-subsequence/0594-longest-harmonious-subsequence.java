class Solution {
    public int findLHS(int[] nums) {
          Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int max=0;
        for (int key : counter.keySet()) {
            if (counter.containsKey(key + 1)) {
                max = Math.max(max, counter.get(key) + counter.get(key + 1));
            }
        }
        return max;
    }
}