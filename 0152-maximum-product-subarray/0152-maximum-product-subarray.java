class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currentMin = 1;
        int currentMax = 1;

        for (int ele : nums) {
            int temp = currentMax * ele;

            currentMax = Math.max(ele, Math.max(currentMax * ele, currentMin * ele));
            currentMin = Math.min(ele, Math.min(temp, currentMin * ele));

            max = Math.max(max, currentMax);
        }

        return max;
    }
}
