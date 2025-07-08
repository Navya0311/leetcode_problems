class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // points[i] = total points from choosing number i
        int[] points = new int[max + 1];
        for (int num : nums) {
            points[num] += num;
        }

        // Now it's the House Robber problem
        int[] dp = new int[max + 1];
        dp[0] = points[0];
        dp[1] = Math.max(points[0], points[1]);

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }

        return dp[max];
    }
}
