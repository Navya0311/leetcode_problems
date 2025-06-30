class Solution {
    public int minimumSum(int num) {
        int res[]=new int[4];
         for (int i = 0; i < 4; i++) {
            res[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(res);
         int new1 = res[0] * 10 +res[2];
        int new2 = res[1] * 10 + res[3];
        return new1+new2;
        
    }
}