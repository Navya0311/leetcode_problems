class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length; 
       rev(nums,0,nums.length-1);
       rev(nums,0,k-1);
       rev(nums,k,nums.length-1); 
        

    }
    static void rev(int []nums,int start,int end)
    {    
        
        while(start<=end)
        {
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
        
    }
}