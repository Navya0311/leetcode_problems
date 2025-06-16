class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum=0;

       for(int ele:nums)
       {
          sum=sum+ele;
          if(sum>max)
          max=sum;
          if(sum<0)
          sum=0;
       }
       return max;
    }
}