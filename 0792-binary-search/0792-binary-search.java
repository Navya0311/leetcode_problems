class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return bin(nums,target,s,e);
    }
    public int bin(int [] nums,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==target)
        {
            return m;
        }
        else if(nums[m]>target)
        {
            return bin(nums,target,s,m-1);
        }
        return bin(nums,target,m+1,e);
    }
}