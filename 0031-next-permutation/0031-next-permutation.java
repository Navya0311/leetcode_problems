class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int j = n - 1; j > index; j--) {
            if (nums[j] > nums[index]) {
                swap(nums, index, j);
                break;
            }
        }

        reverse(nums, index + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            swap(nums, i, j);
        }
    }
}
