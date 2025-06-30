class Solution {
    public int alternateDigitSum(int n) {
        int[] digits = new int[10];  // max 10 digits for an int
        int len = 0;

        // Step 1: Extract digits from right to left
        while (n > 0) {
            digits[len++] = n % 10;
            n /= 10;
        }

        // Step 2: Process from left to right (i.e., reverse order of digits[])
        int sum = 0;
        for (int i = len - 1; i >= 0; i--) {
            if ((len - 1 - i) % 2 == 0) {
                sum += digits[i];  // even position from left -> +
            } else {
                sum -= digits[i];  // odd position from left -> -
            }
        }

        return sum;
    }
}
