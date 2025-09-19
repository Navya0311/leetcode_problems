class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
            {
                return nums[0];
            }       
         int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {   
            int pick=nums[i];
            if(i>1)
            pick=pick+dp[i-2];
            int notpick=Integer.MIN_VALUE;
            if(i>1)
            notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[nums.length-1];
    }
    
}