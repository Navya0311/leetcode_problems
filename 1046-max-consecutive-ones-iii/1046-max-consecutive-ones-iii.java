class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,maxlen=0;
        int max_zeroes=0,max=0;
        for(int i=0;i<nums.length;i++)
        {  
            if(nums[i]==0)
            {
                max_zeroes++;
            }
            while(max_zeroes>k)
            {
                if(nums[l]==0)
                {
                    max_zeroes--;
            
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        
        }
        return max;
    }
}