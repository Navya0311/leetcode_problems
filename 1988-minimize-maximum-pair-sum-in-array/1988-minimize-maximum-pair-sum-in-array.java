class Solution {
    public int minPairSum(int[] nums) {
        int sum=0;
        int max=0;
       Arrays.sort(nums);
       int s=0;
       int e=nums.length-1;
        while(s<e)
        {    
          sum=nums[s]+nums[e];
          s++;
          e--;
         if(sum>max)
          max=sum; 
        }
        return max;
    }
}