class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minlength = Integer.MAX_VALUE, length;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= target) {
                length = i - start + 1;
                sum = sum - nums[start];
                start++;
                if (length < minlength) {
                    minlength = length;
                }
            }

        }
        if(minlength==Integer.MAX_VALUE)
        return 0;
        return minlength;
    }
}