class Solution {
    public int[] runningSum(int[] nums) {
        int res[]=new int[nums.length];
        int sum=nums[0];
       for(int i=0;i<nums.length;i++)
       {
            if(i==0)
            {
                nums[i]=nums[i];
            }
            else
            {
                nums[i]=nums[i]+nums[i-1];
            }
       }
       return  nums;
        
    }
}