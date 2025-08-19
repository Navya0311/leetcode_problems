class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++)
        {
            
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
           int  total=nums[i]+nums[j]+nums[k];
            if(Math.abs(total-target)<Math.abs(closet-target))
            {
                closet=total;
            }
            if (total > target) {
                    k--;
                } else if (total < target) {
                    j++;
                } else {
                    return total; 
                }

            }
           
        }
        return closet;
    }
}