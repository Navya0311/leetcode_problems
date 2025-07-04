class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxjumps=0;
        for(int i=0;i<n;i++)
        {
            if(i>maxjumps)
            {
                return false;
            }
            if(maxjumps>=n-1)
            {
                return true;
            }
            maxjumps=Math.max(maxjumps,i+nums[i]);
        }
        return false;
    }
}