class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        return Math.max(helper(nums, 0, n - 2), helper(nums, 1, n - 1));
    }

    int helper(int nums[], int s, int e) {
        int len = e - s + 1;
        if (len == 1) return nums[s];

        int dp[] = new int[len];
        dp[0] = nums[s];
        dp[1] = Math.max(nums[s], nums[s + 1]);

        for (int i = 2; i < len; i++) {
            int pick = nums[s + i] + dp[i - 2];
            int notpick = dp[i - 1];
            dp[i] = Math.max(pick, notpick);
        }

        return dp[len - 1];
    }
}
