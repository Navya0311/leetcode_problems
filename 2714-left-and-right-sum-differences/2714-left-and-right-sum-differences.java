class Solution {
    public int[] leftRightDifference(int[] nums) {
        int t=0;
        int ans[]=new int[nums.length];
        for(int ele:nums)
        {
            t=t+ele;
        }
        int ls=0;
        for(int i=0;i<nums.length;i++)
        {
            int rs=t-nums[i]-ls;
            
            int res=rs-ls;
            ls=ls+nums[i];
            if(res<0)
            {
                res=-res;
            }
             ans[i]=res;
        }
        return ans;
    }
}