class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }
        int[] ans={-1,-1};
        int start=bin(nums,target,true);
        int end=bin(nums,target,false);
        // return new int[]{start,end};
        ans[0]=start;
        ans[1]=end;
        return ans;
       
     }
     static int bin(int[] nums,int target,boolean firstindex)
     {
        int l=0;
        int g=nums.length-1;
        int ans=-1;
        while(l<=g)
        {
            int mid=l+(g-l)/2;
             if(nums[mid]>target)
            {
                g=mid-1;
            }
            else if(nums[mid]<target)
            {
            l=mid+1;
            }
            else
            {
                ans=mid;
                if(firstindex)
                {
                    g=mid-1;
                }
                else
                l=mid+1;

            }
        }
        return ans;
     }
 }