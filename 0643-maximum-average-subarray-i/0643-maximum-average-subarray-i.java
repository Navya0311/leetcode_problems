class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        int max=sum;
        for(int i=k;i<nums.length;i++)
        {
             max=max+nums[i]-nums[i-k];
             if(max>sum)
             {
                sum=max;
             }
        }
        return (double)sum/k;
    }
}