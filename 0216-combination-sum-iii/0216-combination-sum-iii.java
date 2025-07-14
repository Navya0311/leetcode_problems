class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int c[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(0, ans, res, c, n,k);
        return res;
  }
   public static void helper(int i, List<Integer> subarray, List<List<Integer>> res, int[] c, int target,int k) {
        int subsum = 0;
        for (int num : subarray) {
            subsum += num;
        }
        if (subsum == target&&subarray.size()==k) {
            res.add(new ArrayList<>(subarray));
            return;
        }
        if (subsum > target) {
            return;
        }

        HashSet<Integer> seen = new HashSet<>();
        for (int j = i; j < c.length; j++) {
            if (seen.contains(c[j])) continue;
            seen.add(c[j]);

            subarray.add(c[j]);
            helper(j + 1, subarray, res, c, target,k);
            subarray.remove(subarray.size() - 1);
        }
    }
}